package com.example.myprogram.repo;

import com.example.myprogram.entity.Map;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MapRepo extends CrudRepository<Map, Long> {
    List<Map> findAll();
}
