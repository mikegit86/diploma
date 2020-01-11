package ru.mike.diploma.services;

import ru.mike.diploma.model.Restaurant;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RestaurantService {

   Optional< Restaurant> getRestaurantbyID(int restID);
    void delete(int restID);
    Restaurant addRest(Restaurant restaurant);
    void updateRest(Restaurant restaurant);
    List<Restaurant> getAllRestaurant();
   Restaurant getRestaurantwithTodayMenu (int restID);
    List<Restaurant> getAllwithTodayMenu(LocalDate localDate);


}
