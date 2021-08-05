package com.example.myprogram.Service;

import com.example.myprogram.client.UserClient;
import com.example.myprogram.component.UserMapper;
import com.example.myprogram.dto.UserDto;
import com.example.myprogram.entity.User;
import com.example.myprogram.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserClient userClient;
    @Autowired
    private UserMapper userMapper;

    public List<UserDto> getUserByUsername(String username) {
        List<UserDto> users = Arrays.asList(userClient.getOsuUser(username).getBody());
        setUserImgUrl(users);
        addUser(users.get(0));
        return users;
    }

    private List<UserDto> setUserImgUrl(List<UserDto> users) {
        return users.stream().peek(userDto -> userDto.setImgUrl(userClient.getUserImage(userDto.getUser_id()))).collect(Collectors.toList());
    }

    private void addUser(UserDto userDto) {
        if (!userRepo.existsByUsername(userDto.getUsername())) {
            userRepo.save(userMapper.toEntity(userDto));
        }
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }
}
