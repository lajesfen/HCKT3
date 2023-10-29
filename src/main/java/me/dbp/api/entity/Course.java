package me.dbp.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "course")
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private Integer credits;

    private String courseContent;

    private String code;

    private String area;

    private String HRGroup;

    private Integer cycle;

    @OneToOne
    @JoinColumn(name = "coursetype_id")
    private CourseType courseType;

    private String VRGroup;

    public Course() {}
    
}