package ru.mike.diploma.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.mike.diploma.model.User;
import ru.mike.diploma.services.UserService;

import java.net.URI;

@RestController
@RequestMapping(AdminUserController.URL)
public class AdminUserController {
    static final  String URL = "/admin/user";
    @Autowired
    UserService userService;
    @GetMapping(value = "/get/{Id}")
    public User getUser(@PathVariable ("Id") int Id){
       return userService.getbyID(Id).get();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User>  add (@RequestBody User user){
    User addUser =    userService.add(user);
        URI uriOfNewResource = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path(URL + "/{id}")
                .buildAndExpand(addUser.getId()).toUri();
        return ResponseEntity.created(uriOfNewResource).body(addUser);
    }
}
