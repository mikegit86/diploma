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
        //UserService userServiceImpl =  (UserService)  applicationContext.getBean("userServiceImpl");
       VoteService voteService =  (  VoteService)  applicationContext.getBean("voteServiceImpl");
      // voteService.save(new Vote(LocalDate.now(),new Restaurant("PhoboUp",6),new User("patrik",5,"patrik33GAV@mail.ru", Role.USER,"kdfjf")));
        //System.out.println(voteService.getAllByLocalDate(LocalDate.of(2019,12,22)));
       System.out.println(voteService.getAllByUserIdAndLocalDate(3,LocalDate.now()));
        //System.out.println(voteService.getAllByRestaurantIdAndLocalDate(2,LocalDate.of(2019,12,22)));
       // voteService.delete(1);

       // System.out.println( menurepoHiber.getAllMenuDateandRestID(LocalDate.of(2019,10,12),1));
        //System.out.println(menurepoHiber.getAllMenuDate(LocalDate.of(2019,10,12)));
       //Restaurant restaurant = new Restaurant("PhoboUp",6);

//userServiceImpl.add(new User("patrik",5,"patrikGAV@mail.ru", Role.USER,"kdfjf"));
       // System.out.println(restaurantService.getRestaurantwithTodayMenu(3).getMenuList());
        //System.out.println(restaurantService.getAllwithTodayMenu(LocalDate.now()));
       // System.out.println(restaurantService.getRestaurantbyID(4).orElse(null));

       // restaurantService.delete(5);
        //System.out.println(restaurantService.getAllRestaurant());
        //System.out.println();
        //userServiceImpl.delete(4);
        //System.out.println(menurepojpa.getAllByLocalDate(LocalDate.of(2019,10,12)));

        //System.out.println(menurepojpa.getMenuByLocalDateAndRestaurantId(LocalDate.of(2019,10,12),5));
      //  menurepojpa.save(new Menu("fish5",2000,restaurant,LocalDate.of(2019,11,12)));
     // menurepoHiber.updateMenu(new Menu("hiup",1,333,restaurant,LocalDate.of(2019,10,12)),1);
       // System.out.println( menurepoHiberjpa.getMenu(8));
      // menurepoHiberjpa.updateMenu(new Menu("UPDATE",12,1999,restaurant,LocalDate.of(2019,10,12)),5);
        //menurepoHiberjpa.addMenu(new Menu("UPDATE88",21999,restaurant,LocalDate.of(2019,11,12)));
        //menurepoHiberjpa.deleteMenu(13);
      //  System.out.println(menurepoHiberjpa.getAllMenuDate(LocalDate.of(2019,10,12)));
        //System.out.println( menurepoHiberjpa.getAllMenuDateandRestID(LocalDate.of(2019,10,12),5));
       // System.out.println( menurepoHiber.getMenu(8));


        //menurepojdbcTemplate.deleteMenu(5);
       // MenuRepositoryImplJDBC menurepojdbc =  (MenuRepositoryImplJDBC)  applicationContext.getBean("menuRepositoryImplJDBC");
        //System.out.println( menurepojdbc.getAllMenuDate( LocalDate.of(2019,10,12)));
        //System.out.println( menurepojdbc.getAllMenuDateandRestID( LocalDate.of(2019,10,12),1));
     //  Restaurant restaurant = new Restaurant("superfish1",4);
       // menurepojdbcTemplate.addMenu(new Menu("superfish3",313,restaurant,LocalDate.of(2019,3,12)));
       // System.out.println(menurepojdbcTemplate.getAllMenuDate(LocalDate.of(2019,10,12)));
        //menurepojdbc.addMenu(new Menu("superfish",33,restaurant,LocalDate.of(2019,10,12)));
        //menurepojdbc.deleteMenu(7);
        //menurepojdbc.updateMenu(new Menu("UPDATE",5,999,restaurant,LocalDate.of(2019,10,12)),5);
        //menurepojdbcTemplate.updateMenu(new Menu("superfish3UPP",2,313,restaurant,LocalDate.of(2019,3,12)),2);

    }



}
