package com.example.api.Embeddable;

import com.example.api.Model.Privilege;
import com.example.api.Model.Role;
import com.example.api.Model.User;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
@Table(name = "user_privilege")
public class UserPrivilegeEmbedded implements Serializable {
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "privilege_id")
    private Privilege privilege;

    public UserPrivilegeEmbedded() {
    }

    public UserPrivilegeEmbedded(User user,Privilege privilege){
        this.user = user;
        this.privilege = privilege;
    }
}
