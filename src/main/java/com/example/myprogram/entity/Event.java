package com.example.myprogram.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String display_html;
    private Integer beatmap_id;
    private Integer beatmapset_id;
    private String date;
    private Integer epicfactor;
}
