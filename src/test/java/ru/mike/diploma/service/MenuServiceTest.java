package ru.mike.diploma.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.mike.diploma.model.Menu;

import ru.mike.diploma.services.MenuService;
import ru.mike.diploma.services.MenuServiceImpl;

import java.time.LocalDate;
import java.util.List;

import static ru.mike.diploma.testData.RestaurantTestData.*;

public class MenuServiceTest extends AbstractServiceTest{
    @Autowired
    MenuService menuService;

    @Test
   public void getById() {
        Menu menu = menuService.getMenu(1,1);
        //assertThat(menu).isEqualToIgnoringGivenFields(MENU1_OF_REST_1,"restaurant");
        Assert.assertEquals(MENU1_OF_REST_1, menu);
    }

    @Test
    public void addMenu(){
        Menu newMenu = getNewMenu();
        menuService.addMenu(newMenu,2);
        Assert.assertEquals(newMenu,menuService.getMenu(6,2));

    }
    @Test
    public void deleteMenu(){
      LocalDate localDate = menuService.getMenu(5,1).getLocalDate();
        menuService.deleteMenu(5,1);
        Assert.assertEquals(menuService.getAllMenu(1), List.of(MENU1_OF_REST_1,MENU2_OF_REST_1));
    }
    @Test
   public void getAllMenuDateandRestID () {

     List<Menu> menuListDB =   menuService.getAllMenuDateandRestID(DATE_1,REST1_ID);
        Assert.assertEquals(List.of(MENU1_OF_REST_1,MENU2_OF_REST_1), menuListDB);

   }
@Test
    public void getAllMenu (){
        List<Menu> menuListDB =   menuService.getAllMenu(1);
        Assert.assertEquals(List.of(MENU1_OF_REST_1,MENU2_OF_REST_1,MENU3_OF_REST_1),menuListDB);

    }

}
