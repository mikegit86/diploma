package ru.mike.diploma.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="menu")

public class Menu extends AbstractNamedEntity  {
@Column(name = "price")
   private long price;
    @ManyToOne(fetch = FetchType.LAZY)
 //   @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
@JoinColumn(name="id_rest")

  // @OnDelete(action = OnDeleteAction.CASCADE)
  //  @JsonIgnore
   private  Restaurant restaurant;
    @Column(name = "datemenu")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
   private LocalDate localDate;

    public Menu(long price, Restaurant restaurant, LocalDate localDate) {
        this.price = price;
        this.restaurant = restaurant;
        this.localDate = localDate;
    }
    public Menu(String name,long price,  LocalDate localDate) {
        this.name = name;
        this.price = price;

        this.localDate = localDate;
    }
    public Menu(String name, long price, Restaurant restaurant, LocalDate localDate) {
        super(name,null);
        this.price = price;
        this.restaurant = restaurant;
        this.localDate = localDate;
    }


    public Menu(String name, Integer id, long price, Restaurant restaurant, LocalDate localDate) {
        super(name, id);
        this.price = price;
        this.restaurant = restaurant;
        this.localDate = localDate;
    }
    public Menu(String name, Integer id, long price,  LocalDate localDate) {
        super(name, id);
        this.price = price;
        this.localDate = localDate;
    }

    public Menu() {
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
