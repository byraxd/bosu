package com.example.myprogram.Service;

import com.example.myprogram.client.BeatmapClient;
import com.example.myprogram.dto.BeatmapDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class BeatmapService {
    @Autowired
    private BeatmapClient beatmapClient;

    public List<BeatmapDto> getBeatmapsSinceSubmitdate(String submitDate){
        List<BeatmapDto> test = Arrays.asList(beatmapClient.getOsuBeatmap(submitDate).getBody());
        return test;
    }

}
