package ru.mike.diploma.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.mike.diploma.model.Menu;
import ru.mike.diploma.services.MenuService;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

@RestController

@RequestMapping(value = "/api/admin/restaurants/{restId}/menus", produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuController {
    protected final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    MenuService menuService;

    @GetMapping(value = "/{menuId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Menu get(@PathVariable(name = "menuId") int menuId,@PathVariable (name = "restId") int restId) {
        log.info("menuId", menuId);

        return menuService.getMenu(menuId,restId);
    }

    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    //@RequestMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Menu> getAllDate(@PathVariable (name = "restId") int restId) {
        // log.info("Request to: " + MENU_URL);
        return menuService.getAllMenu(restId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Menu> create(@PathVariable(name = "restId") int restId, @RequestBody Menu menu) {
     Menu creatMenu =   menuService.addMenu(menu, restId);
       // Menu creatMenu = menuService.getMenu(menu.getId());
        URI uriofNewResource = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{dishId}")
                .buildAndExpand(creatMenu.getId()).toUri();

        return ResponseEntity.created(uriofNewResource).body(creatMenu);


    }
}
