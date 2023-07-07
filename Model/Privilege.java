package com.example.api.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "privilege")
public class Privilege {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "privilege_id")
    private  Integer privilegeId;

    @Column(name = "privilege_type")
    private String privilegeType;

    @Column(name = "privilege_category")
    private String privilegeCategory;

    @Column(name = "privilege_description")
    private String privilegeDesc;

    @ManyToOne
    @JoinColumn(name = "parent_privilege")
    private Privilege parent;

}
