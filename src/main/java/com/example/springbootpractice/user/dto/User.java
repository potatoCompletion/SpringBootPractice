package com.example.springbootpractice.user.dto;

import com.example.springbootpractice.user.domain.UserEntity;
import lombok.Builder;
import lombok.Data;

@Data
public class User {

    private String userId;
    private String password;
    private String name;
    private String address;

    @Builder
    public User(String userId, String password, String name, String address) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public User(UserEntity entity) {

        this.userId = entity.getUserId();
        this.password = getPassword();
        this.name = entity.getName();
        this.address = entity.getAddress();
    }
}
