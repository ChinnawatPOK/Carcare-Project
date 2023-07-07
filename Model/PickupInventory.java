package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pickup_product")
public class PickupInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pickup_id")
    private Integer pickupId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductInventory productInventory;

    @Column(name = "pickup_amount")
    private Integer pickupAmount;

    @Column(name = "pickup_date")
    private LocalDateTime pickupDate;

    @Column(name = "price_per_unit")
    private Integer priceCurrent;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "description")
    private String description;

    @Column(name = "pickup_update_date")
    private LocalDateTime updateDate;
}
