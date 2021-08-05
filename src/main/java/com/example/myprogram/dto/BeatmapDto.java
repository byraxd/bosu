package com.example.myprogram.dto;

import lombok.Data;


@Data
public class BeatmapDto {
    private Integer approved;

    private String submit_date;

    private String approved_date;

    private String last_update;

    private String artist;

    private Long beatmap_id;

    private Long beatmapset_id;

    private double bpm;

    private String creator;

    private Long creator_id;

    private double difficultyrating;

    private double diff_aim;

    private double diff_speed;

    private double diff_size;

    private double diff_overall;

    private double diff_approach;

    private double diff_drain;

    private Integer hit_length;

    private String source;

    private Integer genre_id;

    private Integer language_id;

    private String title;

    private Integer total_length;

    private String version;

    private String file_md5;

    private Integer mode;

    private String tags;

    private Integer favourite_count;

    private double rating;

    private Long playcount;

    private Long passcount;

    private Integer count_normal;

    private Integer count_slider;

    private Integer count_spinner;

    private Integer max_combo;

    private Integer storyboard;

    private Integer video;

    private Integer download_unavailable;

    private Integer audio_unavailable;
}
