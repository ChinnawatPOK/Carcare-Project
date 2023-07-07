package com.example.api.Model;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

@Data
@Entity
@Table(name = "invoices")
public class Invoices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Integer invoiceId;

    @Column(name = "status_payment")
    private Integer statusPayment;

    @Column(name = "service_price")
    private Integer servicePrice;

}
