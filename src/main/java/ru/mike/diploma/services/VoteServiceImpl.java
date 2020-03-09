package ru.mike.diploma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mike.diploma.model.Vote;
import ru.mike.diploma.persistence.repository.MenuRepository;
import ru.mike.diploma.persistence.repository.RestaurantRepository;
import ru.mike.diploma.persistence.repository.UserRepository;
import ru.mike.diploma.persistence.repository.VoteRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VoteServiceImpl implements VoteService {
    @Autowired
    MenuRepository menuRepository;
    @Autowired
    UserService userRepository;
    @Autowired
    RestaurantService restaurantRepository;
    @Autowired
    VoteRepository voteRepository;

    @Override
    public Optional<Vote> getById(int voteID) {
        return voteRepository.getById(voteID);
    }

    @Override
    public List<Vote> getAllByRestaurantIdAndLocalDate(int restId, LocalDate localDate) {
        return voteRepository.getAllByRestaurantIdAndLocalDate(restId, localDate);
    }

    @Override
    public Vote getAllByUserIdAndLocalDate(int userID, LocalDate localDate) {
        return voteRepository.getAllByUserIdAndLocalDate(userID, localDate);
    }

    @Override
    public List<Vote> getAllByLocalDate(LocalDate localDate) {

        return voteRepository.getAllByLocalDate(localDate);
    }

    @Override
    public Vote save(Vote vote) {
        return voteRepository.save(vote);
    }

    @Override
    public void delete(int voteId) {
        voteRepository.deleteById(voteId);
    }

    @Override
    public Vote saveOrUpdate(Vote vote, int restId, int userId) {
        vote.setRestaurant(restaurantRepository.getRestaurantbyID(restId).get());
        vote.setUser(userRepository.getbyID(userId).get());
        return voteRepository.save(vote);
    }


}
