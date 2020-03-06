package com.example.springbootdemo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_location")
    private String userLocation;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_uuid")
    private UUID userUUID;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "user_enabled")
    private boolean userEnabled;

    public UserInfo() {

    }
}
