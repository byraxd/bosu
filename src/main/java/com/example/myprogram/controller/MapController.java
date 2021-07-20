package com.example.myprogram.controller;

import com.example.myprogram.dto.MapDto;
import com.example.myprogram.entity.Map;
import com.example.myprogram.repo.MapRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MapController {
    @Autowired
    private MapRepo mapRepo;

    @Autowired
    private ModelMapper mapper;
    @GetMapping("/showMaps")
    public List<Map> findAll() {
        return mapRepo.findAll();
    }

    @PostMapping("/addMap")
    public void addMap(@RequestBody MapDto mapDto){
            Map map = mapper.map(mapDto, Map.class);
            mapRepo.save(map);
    }
}
