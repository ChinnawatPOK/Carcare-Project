package com.example.api.Model;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "promotion_collection")
public class PromotionCollection {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "promotion_collection")
    private Integer promotionCollection;

    @Column(name = "promotion_name")
    private String promotionName;

    @Column(name = "promotion_description")
    private String promotionDescription;

    @Column(name = "promotion_condition")
    private Integer promotionCondition;

    @Column(name = "car_type")
    private String carType;

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @Column(name = "promotion_status")
    private Integer promotionStatus;

    @Column(name ="promotion_minimum")
    private Integer promotionMinimum;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "expire_date")
    private LocalDateTime expireDate;

}
