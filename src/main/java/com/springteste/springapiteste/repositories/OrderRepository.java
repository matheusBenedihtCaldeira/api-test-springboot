package com.springteste.springapiteste.repositories;

import com.springteste.springapiteste.entities.Order;
import com.springteste.springapiteste.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
