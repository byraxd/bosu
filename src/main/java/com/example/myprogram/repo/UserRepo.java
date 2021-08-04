package com.example.myprogram.repo;

import com.example.myprogram.entity.Map;
import com.example.myprogram.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    List<User> findAll();
}
