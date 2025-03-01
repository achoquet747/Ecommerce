package com.arieldev.Ecommerce.Sport.repository;

import com.arieldev.Ecommerce.Sport.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
