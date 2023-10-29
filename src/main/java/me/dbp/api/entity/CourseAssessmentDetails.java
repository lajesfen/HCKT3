package me.dbp.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "courseassessmentdetails")
@Getter
@Setter
public class CourseAssessmentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String score;

    private String section;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @OneToOne
    @JoinColumn(name = "courseassessment_id")
    private CourseAssessment courseAssessment;

    private String sectionGroup;

    public CourseAssessmentDetails() {}

    
}