package ru.mike.diploma.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mike.diploma.model.Menu;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    List<Menu> getMenuByLocalDateAndRestaurantId(LocalDate localDate, int restID);

    List<Menu> getAllMenuByRestaurantId(int restID);

    Menu getMenuByIdAndRestaurantId(int menuID, int restID);

    void deleteByIdAndAndRestaurantId(int menuID, int restID);

}
