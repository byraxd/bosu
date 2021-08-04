package com.example.myprogram.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {
    private String display_html;
    private Integer beatmap_id;
    @Id
    private Integer beatmapset_id;
    private String date;
    private Integer epicfactor;
}
