package com.example.api.Model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "line_information")
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_info_id")
    private Integer lineInfoId;

    @Column(name = "user_id_line")
    private String userIdLine;

    @Column(name = "email_line")
    private String emailLine;

    @Column(name = "permission_line")
    private Integer permissionLine;

    @Column(name = "picture_line")
    private String pictureLine;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User userId;

}
