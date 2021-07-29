package com.example.myprogram.controller;

import com.example.myprogram.Service.MapService;
import com.example.myprogram.dto.MapDto;
import com.example.myprogram.entity.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("map")
public class MapController {
    @Autowired
    private MapService mapService;

    @GetMapping("/all")
    public List<Map> findAll() {
        return mapService.findAll();
    }

    @PostMapping("/add")
    public Map addMap(@RequestBody MapDto mapDto) {
        return mapService.addMap(mapDto);
    }

    @PutMapping("/edit/{id}")
    public Map editMap(@PathVariable("id") Long id, @RequestBody MapDto mapDto) {
        return mapService.editMap(id, mapDto);
    }

    @GetMapping("/getById/{id}")
    public Map getById(@PathVariable("id") Long id) {
        return mapService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        mapService.deleteById(id);
    }

    @GetMapping("/getSortedByStar")
    public List<Map> findByOrderByStarRateAsc() {
        return mapService.findByOrderByStarRateAsc();
    }
}
