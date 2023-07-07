package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_inventory")
public class ProductInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_brand")
    private String productBrand;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "supplier")
    private Supplier supplier;

    private Integer price;
    private String unit;

    @Column(name = "quantity_per_unit")
    private Integer quantityPerUnit;

    @Column(name = "unit_per_quantity")
    private String unitPerQuantity;

    @Column(name = "product_status")
    private Integer productStatus;

    private String description;

    @Column(name = "product_picture")
    private String picture;
}
