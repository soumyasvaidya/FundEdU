package com.fundeduplatform.fundedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/funded/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    @Autowired
   UserService userService;

    @GetMapping("/register")
    public Long login(@RequestBody UserDTO userDTO){
        return 123456
    }

    @PostMapping("/login")
    public Long login(@RequestBody UserDTO userDTO){
        return 123456
    }

    @GetMapping("/user/details")
    public Object fetchUserDetails(@RequestParam Long userId){
        return null
    }

}
