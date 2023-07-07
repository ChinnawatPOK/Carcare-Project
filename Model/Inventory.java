package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Integer inventoryId;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private ProductInventory product;

    @Column(name = "quantity_remain")
    private Integer quantityRemain;
}
