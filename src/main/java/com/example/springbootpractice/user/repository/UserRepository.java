package com.example.springbootpractice.user.repository;

import com.example.springbootpractice.user.domain.UserEntity;
import com.example.springbootpractice.user.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUserId(String userId);
}
