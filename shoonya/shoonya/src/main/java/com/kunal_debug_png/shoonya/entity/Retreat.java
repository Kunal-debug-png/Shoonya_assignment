package com.kunal_debug_png.shoonya.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Retreat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Long date;
    private String location;
    private Double price;
    private String type;
    private String condition;
    private String image;
    private Integer duration;

    @ElementCollection
    private List<String> tag;
}