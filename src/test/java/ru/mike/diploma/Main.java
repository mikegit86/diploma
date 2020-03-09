package ru.mike.diploma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.mike.diploma.model.Restaurant;
import ru.mike.diploma.model.Role;
import ru.mike.diploma.model.User;
import ru.mike.diploma.model.Vote;
import ru.mike.diploma.persistence.repository.MenuRepository;
import ru.mike.diploma.services.RestaurantService;
import ru.mike.diploma.services.UserService;
import ru.mike.diploma.services.UserServiceImpl;
import ru.mike.diploma.services.VoteService;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconf.xml");
        RestaurantService restaurantService = (RestaurantService) applicationContext.getBean("restaurantServiceImpl");
        System.out.println(restaurantService.getAllwithTodayMenu(LocalDate.now()));
    }

}
