package com.example.myprogram.Service.impl;

import com.example.myprogram.Service.MapService;
import com.example.myprogram.dto.MapDto;
import com.example.myprogram.entity.Map;
import com.example.myprogram.repo.MapRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapServiceImpl implements MapService {
    @Autowired
    private MapRepo mapRepo;

    @Autowired
    private ModelMapper mapper;
    @Override
    public List<Map> findAll() {
        return mapRepo.findAll();
    }

    public void deleteById(Long id) {
        mapRepo.deleteById(id);
    }

    public Map getById(Long id) {
        return mapRepo.findById(id).orElse(new Map());
    }

    public Map editMap(Long id, MapDto mapDto) {
        Map map = getById(id);
        map.setName(mapDto.getName());
        map.setAuthorName(mapDto.getAuthorName());
        map.setBpm(mapDto.getBpm());
        map.setStarRate(mapDto.getStarRate());
        return mapRepo.save(map);
    }

    public Map addMap(MapDto mapDto) {
        Map map = mapper.map(mapDto, Map.class);
        return mapRepo.save(map);
    }
    public List<Map> findByOrderByStarRateAsc(){
        return mapRepo.findByOrderByStarRateAsc();
    }
}
