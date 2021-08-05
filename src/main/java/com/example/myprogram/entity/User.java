package com.example.myprogram.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
@Getter
@Setter
@Entity
public class User {
    @Id
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

    private String imgUrl;
}
