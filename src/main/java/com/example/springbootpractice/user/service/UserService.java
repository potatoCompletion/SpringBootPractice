package com.example.springbootpractice.user.service;

import com.example.springbootpractice.user.domain.UserEntity;
import com.example.springbootpractice.user.dto.User;
import com.example.springbootpractice.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public User getUser(Long userCode) {

        return new User(userRepository.findById(userCode).orElseThrow( () -> {
            throw new UsernameNotFoundException("qq");
        }));
    }

    public Long createUser(User user) {

        UserEntity userEntity = UserEntity.builder()
                .userId(user.getUserId())
                .password(user.getPassword())
                .name(user.getName())
                .address(user.getAddress())
                .build();

        userRepository.save(userEntity);

        return userRepository.findByUserId(user.getUserId()).getId();
    }
}
