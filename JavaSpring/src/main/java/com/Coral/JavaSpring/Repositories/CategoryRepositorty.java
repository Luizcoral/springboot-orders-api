package com.Coral.JavaSpring.Repositories;

import com.Coral.JavaSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositorty extends JpaRepository<Category, Long> {

}
