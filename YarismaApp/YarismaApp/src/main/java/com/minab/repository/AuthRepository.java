package com.minab.repository;

import com.minab.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Long> {

    boolean existsByUsername(String username);
}
