package com.example.myprogram.client;

import com.example.myprogram.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UserClient {
    @Autowired
    private RestTemplate restTemplate;
    private final String URL_OSU = "https://osu.ppy.sh/api/get_user";
    private static final String URL_OSU_IMG = "http://s.ppy.sh/a/user_id";
    private static final String API_KEY = "2f76d6431424b6ad60a890da9e135e7e1d34d387";

    public ResponseEntity<UserDto[]> getOsuUser(String username) {
        HttpHeaders headers = new HttpHeaders();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL_OSU)
                .queryParam("k", API_KEY)
                .queryParam("u", username);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        return restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                UserDto[].class);
    }
    public String getUserImage(Long user_id) {
        return restTemplate.getForObject(URL_OSU_IMG + "/" + user_id, String.class);
    }
}
