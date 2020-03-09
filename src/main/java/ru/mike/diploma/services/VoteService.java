package ru.mike.diploma.services;

import ru.mike.diploma.model.Vote;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface VoteService {

    Optional<Vote> getById(int voteID);

    List<Vote> getAllByRestaurantIdAndLocalDate(int restId, LocalDate localDate);

    Vote getAllByUserIdAndLocalDate(int userID, LocalDate localDate);

    List<Vote> getAllByLocalDate(LocalDate localDate);

    Vote save(Vote vote);

    void delete(int voteId);

    Vote saveOrUpdate(Vote vote, int restId, int userId);
}
