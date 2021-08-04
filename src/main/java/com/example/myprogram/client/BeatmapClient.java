package com.example.myprogram.client;

import com.example.myprogram.dto.BeatmapDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BeatmapClient {
    @Autowired
    private RestTemplate restTemplate;

    private static final String URL_BEATMAP = "https://osu.ppy.sh/api/get_beatmaps?k=2f76d6431424b6ad60a890da9e135e7e1d34d387&since=%s";
    private static final String API_KEY = "2f76d6431424b6ad60a890da9e135e7e1d34d387";

    public ResponseEntity<BeatmapDto[]> getOsuBeatmap(String submitDate) {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<?> entity = new HttpEntity<>(headers);
        return  restTemplate.exchange(
                String.format(URL_BEATMAP, submitDate),
                HttpMethod.GET,
                entity,
                BeatmapDto[].class);
    }
}
