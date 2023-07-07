package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_status")
    private Integer categoryStatus;

    @Column(name = "category_description")
    private String description;
}
