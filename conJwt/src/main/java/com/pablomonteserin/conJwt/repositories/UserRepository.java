package com.pablomonteserin.conJwt.repositories;

import com.pablomonteserin.conJwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
     User findByUsername(String username);
}
