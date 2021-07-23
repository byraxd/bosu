package com.example.myprogram.Service;

import com.example.myprogram.dto.MapDto;
import com.example.myprogram.entity.Map;

import java.util.List;

public interface MapService {

    List<Map> findAll();
    void deleteById(Long id);
    Map getById(Long id);
    Map editMap(Long id, MapDto mapDto);
    Map addMap(MapDto mapDto);
    List<Map> findByOrderByStarRateAsc();
}
