package com.man.cafe.models;

import com.man.cafe.enums.Role;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;


@NamedQuery(name = "User.findByEmailId",
        query = "select u from User u where u.email = :email")

@Entity
@Data
@DynamicInsert
@DynamicUpdate
@Table(name="user")
public class User implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "contactNumber")
    private String contactNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private String status;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;



}
