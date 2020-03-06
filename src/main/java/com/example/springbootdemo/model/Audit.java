package com.example.springbootdemo.model;

import com.example.springbootdemo.model.audit.AuditType;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "audit")
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_uuid")
    private UUID userUUID;

    @Column(name = "audit_type")
    @Enumerated(EnumType.STRING)
    private AuditType auditType;

    @Column(name = "description")
    private String description;

    @Column(name = "event_time")
    private Date eventTime;

}
