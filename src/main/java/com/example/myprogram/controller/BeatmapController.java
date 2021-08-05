package com.example.myprogram.controller;

import com.example.myprogram.Service.BeatmapService;
import com.example.myprogram.dto.BeatmapDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeatmapController {

    @Autowired
    private BeatmapService beatmapService;

    @GetMapping("/getOsuBeatmap/{since}")
    public List<BeatmapDto> getOsuBeatmap(@PathVariable("since") String submitDate) {
    return beatmapService.getBeatmapsSinceSubmitdate(submitDate);
    }
}
