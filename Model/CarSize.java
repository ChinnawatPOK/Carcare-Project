package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "carsize_details")
public class CarSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column(name = "brand_car")
    private String brand;

    @Column(name = "model_car")
    private String model;

    @Column(name = "car_size")
    private String carSize;

    @Column(name = "brand_thai")
    private String brandThai;

    @Column(name = "model_thai")
    private String modelThai;
}