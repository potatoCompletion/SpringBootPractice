package com.example.springbootpractice.user.controller;

import com.example.springbootpractice.user.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @PostMapping("join")
    public ResponseEntity<Boolean> join(@RequestParam User user) {


    }
}
