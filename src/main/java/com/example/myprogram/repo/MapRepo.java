package com.example.myprogram.repo;

import com.example.myprogram.entity.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MapRepo extends JpaRepository<Map, Long> {
    List<Map> findAll();
    void deleteById(Long id);
    Optional<Map> findById(Long id);
    List<Map> findByOrderByStarRateAsc();
}
