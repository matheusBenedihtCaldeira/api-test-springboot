package com.springteste.springapiteste.repositories;

import com.springteste.springapiteste.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
