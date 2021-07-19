package com.example.myprogram.repo;

import com.example.myprogram.entity.Maps;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MapRepo extends CrudRepository<Maps, Long> {
    List<Maps> findAll();
}
