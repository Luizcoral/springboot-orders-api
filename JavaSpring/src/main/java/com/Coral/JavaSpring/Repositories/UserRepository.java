package com.Coral.JavaSpring.Repositories;

import com.Coral.JavaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
