package ru.mike.diploma.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mike.diploma.model.Menu;
import ru.mike.diploma.model.Restaurant;
import ru.mike.diploma.persistence.repository.MenuRepository;
import ru.mike.diploma.persistence.repository.RestaurantRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {
    final static Logger LOG = LoggerFactory.getLogger(RestaurantServiceImpl.class);
    @Autowired
    RestaurantRepository restaurantRepository;
    @Autowired
    MenuRepository menuRepository;
    @Override
    public Optional<Restaurant> getRestaurantbyID(int restID) {
        return restaurantRepository.findById(restID);
    }

    @Override
    public void delete(int restID) {
        restaurantRepository.deleteById(restID);

    }

    @Override
    public void addRest(Restaurant restaurant) {
        restaurantRepository.save(restaurant);

    }

    @Override
    public void updateRest(Restaurant restaurant) {
        restaurantRepository.save(restaurant);

    }

    @Override
    public List<Restaurant> getAllRestaurant() {
        return restaurantRepository.findAll();
    }

   @Override
    public Restaurant getRestaurantwithTodayMenu(int restID) {
   List<Menu>  menu =    menuRepository.getMenuByLocalDateAndRestaurantId(LocalDate.now(),restID);
       LOG.info("menu={}", menu);
      Restaurant restaurant=  (Restaurant) getRestaurantbyID(restID).get();
      restaurant.setMenuList(menu);

        return restaurant;
    }

    @Override
    public List<Restaurant> getAllwithTodayMenu(LocalDate localDate) {
        List<Restaurant> allRest = getAllRestaurant();
        for (Restaurant rest:allRest) {
            List<Menu>  menu=  menuRepository.getMenuByLocalDateAndRestaurantId(LocalDate.now(),rest.getId());

            rest.setMenuList(menu);
            
        }

        return allRest.stream().filter(x->!x.getMenuList().isEmpty()).collect(Collectors.toList());
    }
}
