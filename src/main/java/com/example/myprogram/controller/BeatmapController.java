package com.example.myprogram.controller;

import com.example.myprogram.Service.BeatmapService;
import com.example.myprogram.dto.BeatmapDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeatmapController {

    @Autowired
    private BeatmapService beatmapService;

    @RequestMapping(value = "/getOsuBeatmap", method = RequestMethod.GET)
    public List<BeatmapDto> getOsuBeatmap(@RequestParam(value = "since") String submitDate) {
    return beatmapService.getBeatmapsSinceSubmitdate(submitDate);
    }
}
