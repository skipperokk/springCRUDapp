package ru.springapp.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.springapp.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
