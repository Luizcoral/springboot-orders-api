package com.Coral.JavaSpring.Repositories;

import com.Coral.JavaSpring.entities.OrderItem;
import com.Coral.JavaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
