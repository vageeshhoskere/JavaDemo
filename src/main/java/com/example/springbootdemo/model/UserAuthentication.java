package com.example.springbootdemo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user_authentication")
public class UserAuthentication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_uuid")
    private UUID userUUID;

    @Column(name = "last_login")
    private Date lastLogin;

    @Column(name = "account_locked")
    private boolean accountLocked;

    @Column(name = "password_reset")
    private boolean passwordReset;

    @Column(name = "failed_login_attempts")
    private Integer failedLoginAttempts;

    @Column(name = "auth_url")
    private String authURL;

}
