package com.example.myprogram.controller;

import com.example.myprogram.dto.MapDto;
import com.example.myprogram.entity.Maps;
import com.example.myprogram.repo.MapRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class MapController {
    @Autowired
    private MapRepo mapRepo;

    @Autowired
    private ModelMapper mapper;
    @GetMapping("/showMaps")
    public List<Maps> all() {
        return mapRepo.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody MapDto mapDto){
            Maps maps = mapper.map(mapDto, Maps.class);
            mapRepo.save(maps);
    }
}
