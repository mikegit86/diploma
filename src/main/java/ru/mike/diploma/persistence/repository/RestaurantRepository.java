package ru.mike.diploma.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.mike.diploma.model.Restaurant;

import java.time.LocalDate;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
    List<Restaurant> findAll();
    //@Query("DELETE FROM Restaurant r WHERE r.id=:id")
    //void delete(@Param("id")int restID);
    //void delete(int restID);
    //void addRestaurant(Restaurant restaurant);
   // List<Restaurant> getAllwithTodayMenu(LocalDate localDate);
   // @Query("SELECT r FROM Restaurant r  ORDER BY r.name")
   // List<Restaurant> getAll();
  //  Restaurant getRestaurantwithTodayMenu (int restID);


}
