package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "configuration")
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "configuration_id")
    private Integer configurationId;

    @Column(name = "category")
    private String category;

    @Column(name = "sub_category")
    private String subCategory;

    @Column(name = "value")
    private  String value;

    @Column(name = "description")
    private  String description;
}
