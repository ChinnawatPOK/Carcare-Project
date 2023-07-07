package com.example.api.Model;

import lombok.Data;
import org.springframework.web.bind.annotation.InitBinder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "product_order")
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="order_id")
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductInventory product;

    @Column(name = "order_amount")
    private Integer amount;

    @Column(name = "date_order")
    private LocalDateTime orderDate;

    @Column(name = "order_status")
    private Integer orderStatus;

    @ManyToOne
    @JoinColumn(name = "order_person")
    private User orderPerson;


}
