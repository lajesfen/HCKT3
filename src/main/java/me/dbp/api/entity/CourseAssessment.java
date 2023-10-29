package me.dbp.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "courseassessment")
@Getter
@Setter
public class CourseAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToOne
    @JoinColumn(name = "periodo_id")
    private Periodo periodo;

    private String title;

    private String tipoNota;

    private String numNota;

    private String nomenclatura;

    public CourseAssessment() {}

    
}