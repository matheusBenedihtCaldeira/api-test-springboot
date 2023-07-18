package com.springteste.springapiteste.repositories;

import com.springteste.springapiteste.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
