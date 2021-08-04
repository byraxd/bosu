package com.example.myprogram.controller;

import com.example.myprogram.Service.UserService;
import com.example.myprogram.dto.UserDto;
import com.example.myprogram.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getOsuUser", method = RequestMethod.GET)
    public List<UserDto> getOsuUser(@RequestParam(value = "u") String username){
        return userService.getUserByUsername(username);
    }
    @GetMapping("/all")
    public List<User> findAll() {
        return userService.getAll();
    }
}
