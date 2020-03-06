package com.example.springbootdemo.model;

import com.example.springbootdemo.model.course.InstructorRole;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "course_detail")
public class CourseDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "instructor_ref")
    private UUID instructorRef;

    @Column(name = "academic_year")
    private Integer academicYear;

    @Column(name = "reference_material")
    private String referenceMaterial;

    @Column(name = "batch")
    private String batch;

    @Column(name = "instructor_role")
    @Enumerated(EnumType.STRING)
    private InstructorRole instructorRole;

}
