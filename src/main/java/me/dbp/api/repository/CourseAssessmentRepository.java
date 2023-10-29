package me.dbp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dbp.api.entity.CourseAssessment;

public interface CourseAssessmentRepository extends JpaRepository<CourseAssessment, Long> {
}