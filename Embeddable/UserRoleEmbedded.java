package com.example.api.Embeddable;

import com.example.api.Model.Role;
import com.example.api.Model.User;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
@Table(name = "user_role")
public class UserRoleEmbedded implements Serializable {

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "role_id")
    private Role role;

    public UserRoleEmbedded() {
    }

    public UserRoleEmbedded(User user,Role role){
        this.user = user;
        this.role = role;
    }
}
