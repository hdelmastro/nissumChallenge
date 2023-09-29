package com.nissum.challenge.business.controller;

import com.nissum.challenge.business.model.UserDto;
import com.nissum.challenge.business.model.UserResponseDto;
import com.nissum.challenge.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nissum/api")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/user")
    public ResponseEntity<UserResponseDto> createUser(@Valid @RequestBody UserDto user) {
        UserResponseDto response = userService.createUser(user);

        return ResponseEntity.ok(response);
    }

}
