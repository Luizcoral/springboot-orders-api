package com.Coral.JavaSpring.Repositories;

import com.Coral.JavaSpring.entities.Order;
import com.Coral.JavaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
