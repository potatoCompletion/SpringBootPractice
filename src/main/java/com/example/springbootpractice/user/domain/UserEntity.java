package com.example.springbootpractice.user.domain;

import lombok.*;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String password;
    private String name;
    private String address;

    @Builder
    public UserEntity(String userId, String password, String name, String address) {

        this.userId = userId;
        this.password = password;
        this.name = name;
        this.address = address;
    }
}
