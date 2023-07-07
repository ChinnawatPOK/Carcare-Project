package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "received_product")
public class ReceivedProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "received_id")
    private Integer receiveId;

    @Column(name = "order_id")
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiverId;

    @Column(name = "received_date")
    private LocalDateTime receiveDate;

    @Column(name = "received_amount")
    private Integer receiveAmount;

    private String description;
}
