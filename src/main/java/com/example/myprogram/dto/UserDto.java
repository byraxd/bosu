package com.example.myprogram.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private Long user_id;

    private String username;

    private String join_date;

    private Integer count300;

    private Integer count100;

    private Integer count50;

    private Integer playcount;

    private Long ranked_score;

    private Long total_score;

    private Integer pp_rank;

    private double level;

    private double pp_raw;

    private double accuracy;

    private Integer count_rank_ss;

    private Integer count_rank_ssh;

    private Integer count_rank_s;

    private Integer count_rank_sh;

    private Integer count_rank_a;

    private String country;

    private Integer total_seconds_played;

    private Integer pp_country_rank;

    private List<Event> events;

    private String imgUrl;
    @Data
    public static class Event {
        private String display_html;
        private Integer beatmap_id;
        private Integer beatmapset_id;
        private String date;
        private Integer epicfactor;
    }
}