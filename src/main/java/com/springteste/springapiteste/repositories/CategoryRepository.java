package com.springteste.springapiteste.repositories;

import com.springteste.springapiteste.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
