package ru.mike.diploma.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.mike.diploma.model.Restaurant;
import ru.mike.diploma.services.RestaurantService;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.mike.diploma.testData.RestaurantTestData.MACD;

public class RestaurantServiceTest extends AbstractServiceTest {
    @Autowired
    RestaurantService restaurantService;

    @Test
   public void getRestaurantbyID(){
         Restaurant rest = restaurantService.getRestaurantbyID(1).get();
        assertThat(rest).isEqualToIgnoringGivenFields(MACD,"votes","menuList");

       // Assert.assertEquals(MACD,rest);



    }

}
