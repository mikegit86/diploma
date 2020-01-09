package ru.mike.diploma.services;

import ru.mike.diploma.model.User;

import java.util.Optional;

public interface UserService {

    void add(User user);
    void delete(int userID);

    Optional<User> getbyID(int userID);
    User getByEmail( String email);

}
