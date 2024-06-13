package com.minab.repository;


import com.minab.entity.YarismaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YarismaUserRepository extends JpaRepository<YarismaUser, Long> {
}
