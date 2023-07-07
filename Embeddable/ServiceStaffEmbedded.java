package com.example.api.Embeddable;

import com.example.api.Model.Role;
import com.example.api.Model.ServiceTransaction;
import com.example.api.Model.User;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
@Table(name = "service_staff")
public class ServiceStaffEmbedded implements Serializable {
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "staff_id")
    private User staff;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "service_order")
    private ServiceTransaction service;

    public ServiceStaffEmbedded(){

    }
    public ServiceStaffEmbedded(ServiceTransaction service,User staff){
        this.service = service;
        this.staff = staff;
    }
}
