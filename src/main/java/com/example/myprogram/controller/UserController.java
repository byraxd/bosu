package com.example.myprogram.controller;

import com.example.myprogram.Service.UserService;
import com.example.myprogram.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getOsuUser", method = RequestMethod.GET)
    public ResponseEntity<UserDto[]> getOsuUser(@RequestParam(value = "u") String username){
        return userService.getUserByUsername(username);
    }
}
