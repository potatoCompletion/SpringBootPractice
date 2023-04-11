package com.example.springbootpractice.user.controller;

import com.example.springbootpractice.user.dto.User;
import com.example.springbootpractice.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("join")
    public ResponseEntity<Long> join(@RequestParam User user) {

        Long id = userService.createUser(user);

        return ResponseEntity.ok(id);
    }

    @GetMapping("/")
    public ResponseEntity<Long> hello() {

        User user = User.builder()
                .userId("kws1234")
                .password("123123")
                .name("김완수")
                .address("삼척")
                .build();

        Long id = userService.createUser(user);

        return ResponseEntity.ok(id);
    }
}
