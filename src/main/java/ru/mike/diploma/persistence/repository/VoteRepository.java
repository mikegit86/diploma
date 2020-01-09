package ru.mike.diploma.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mike.diploma.model.Vote;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Integer> {

    Optional<Vote> getById(int voteID);

    // List<Vote> getAllByRestaurantIdAndDate(int restID, LocalDate localDate);
    List<Vote> getAllByRestaurantIdAndLocalDate(int restId,LocalDate localDate);
     //List<Vote> getAllByRestaurantIdToday(int restID, LocalDate localDate);
   //  List<Vote> getAllByUserIdAndDate(int userID, LocalDate localDate);
    Vote getAllByUserIdAndLocalDate(int userID, LocalDate localDate);
    // List<Vote> getAllByDate(LocalDate localDate);
    List<Vote> getAllByLocalDate(LocalDate localDate);




}
