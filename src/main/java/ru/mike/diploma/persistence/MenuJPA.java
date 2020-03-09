package ru.mike.diploma.persistence;

import ru.mike.diploma.model.Menu;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface MenuJPA {
    List<Menu> getAllMenuDateandRestID(LocalDate localDate, int restID) throws SQLException;

    Menu getMenu(int menuID);

    void deleteMenu(int menuID) throws SQLException;

    void addMenu(Menu menu) throws Exception;

    List<Menu> getAllMenuDate(LocalDate localDate) throws SQLException;

    void updateMenu(Menu menu, int restID) throws SQLException;
}
