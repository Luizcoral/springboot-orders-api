package com.Coral.JavaSpring.Repositories;

import com.Coral.JavaSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
