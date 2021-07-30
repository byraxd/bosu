package com.example.myprogram.Service;

import com.example.myprogram.client.UserClient;
import com.example.myprogram.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserClient userClient;

    public ResponseEntity<UserDto[]> getUserByUsername(String username){
        ResponseEntity<UserDto[]> user = userClient.getOsuUser(username);
        user.getBody()[0].setImgUrl(userClient.getUserImage(user.getBody()[0].getUser_id()));
        return user;
    }
}
