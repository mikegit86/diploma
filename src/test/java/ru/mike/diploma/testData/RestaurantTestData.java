package ru.mike.diploma.testData;

import ru.mike.diploma.model.Menu;
import ru.mike.diploma.model.Restaurant;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;



public class RestaurantTestData {
  /*  public static  final int START_SEQ =0;
    public static final int KFC_ID = START_SEQ;
    public static final int MCDONALDS_ID = START_SEQ + 1;
    public static final int KETCHUP_ID = START_SEQ + 2;
    public static final int BUSHE_ID = START_SEQ + 3;

    public static final Restaurant KFC = new Restaurant("kfc",KFC_ID);
    public static final Restaurant MCDONALDS = new Restaurant("mcDonalds",MCDONALDS_ID);
    public static final Restaurant KETCHUP = new Restaurant("ketchup",KETCHUP_ID);
    public static final Restaurant BUSHE = new Restaurant("bushe",BUSHE_ID);
    public static List<Restaurant> ALL_RESTAURANTS = Arrays.asList(BUSHE, KETCHUP, KFC, MCDONALDS);

    List<Restaurant> getAllwithTodayMenu(){
       // BUSHE.setMenuList(Arrays.asList(CAKE_SPECIAL)),KETCHUP.setMenuList(Arrays.asList(KETCHUPBURGER_SPECIAL))
        List<Menu> menuBushe = Arrays.asList(CAKE_SPECIAL);
        List<Menu> menuKetchup = Arrays.asList(KETCHUPBURGER_SPECIAL);

        return Arrays.asList( BUSHE.setMenuList(menuBushe),KETCHUP.setMenuList(menuKetchup));



    }*/


    public static final int REST1_ID =  1;
    public static final int REST2_ID =  2;

    public static final Restaurant MACD = new Restaurant(REST1_ID, "MacDonalds");
    public static final Restaurant KFC = new Restaurant(REST2_ID, "KFC");

    public static final int VOTES_1 = 3;
    public static final int VOTES_2 = 1;

    public static final LocalDate DATE_1 = LocalDate.of(2019, 8, 16);
    public static final LocalDate DATE_2 = LocalDate.now();




    public static final Menu MENU1_OF_REST_1 = new Menu( "BigMac",1, 444 , MACD,DATE_1);
    public static final Menu MENU2_OF_REST_1 = new Menu("CheeseBurger",2,1400,  MACD , DATE_1);
   // public static final Menu MENU3_OF_REST_1 = new Menu( "Fries",3,  1000 , DATE_1);
   // public static final Menu MENU4_OF_REST_1 = new Menu("BigMac", 4 , 2000, DATE_2);
    public static final Menu MENU3_OF_REST_1 = new Menu( "BigMac2",5,555 ,MACD, DATE_2);
  //  public static final Menu MENU6_OF_REST_1 = new Menu( "Fries", 6 , 1000, DATE_2);

    public static final Menu MENU1_OF_REST_2 = new Menu( "Twister",4,232,  KFC, DATE_1);
    public static final Menu MENU2_OF_REST_2 = new Menu("Fries",3,1400,  KFC , DATE_2);
   // public static final Menu MENU3_OF_REST_2 = new Menu("Twister2",9,  1000 , DATE_2);
  //  public static final Menu MENU4_OF_REST_2 = new Menu("BoxMaster2",10 ,  1000, DATE_2);

    public static final List<Menu> MENUS_OF_REST_1 = List.of(MENU3_OF_REST_1,
            MENU1_OF_REST_1, MENU2_OF_REST_1);

    public static final List<Menu> TODAYS_MENUS_OF_REST_1 = List.of(MENU3_OF_REST_1);

    public static final List<Menu> TODAYS_MENUS_OF_REST_2 = List.of(MENU2_OF_REST_2);

    public static Menu getNewMenu() {
        return new Menu("NewBigMac", 2222 ,KFC, LocalDate.now().plusDays(1));
    }

}
