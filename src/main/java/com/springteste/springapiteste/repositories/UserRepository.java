package com.springteste.springapiteste.repositories;

import com.springteste.springapiteste.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
