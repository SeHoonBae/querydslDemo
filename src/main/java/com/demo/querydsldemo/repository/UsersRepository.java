package com.demo.querydsldemo.repository;

import com.demo.querydsldemo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
