package com.example.myprogram.Service;

import com.example.myprogram.dto.MapDto;
import com.example.myprogram.entity.Map;
import com.example.myprogram.repo.MapRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapService {
    @Autowired
    private MapRepo mapRepo;

    @Autowired
    private ModelMapper mapper;
    public List<Map> getAll() {
        return mapRepo.findAll();
    }

    public void deleteById(Long id) {
        mapRepo.deleteById(id);
    }

    public Map getById(Long id) {
        return mapRepo.findById(id).orElse(new Map());
    }

    public Map updateMap(Long id, MapDto mapDto) {
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
    public List<Map> getByOrderByStarRateAsc(){
        return mapRepo.findByOrderByStarRateAsc();
    }
}
