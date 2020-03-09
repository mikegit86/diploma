package ru.mike.diploma.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mike.diploma.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User getByEmail(String emeil);

}
