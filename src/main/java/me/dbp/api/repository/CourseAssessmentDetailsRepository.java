package me.dbp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dbp.api.entity.CourseAssessmentDetails;

public interface CourseAssessmentDetailsRepository extends JpaRepository<CourseAssessmentDetails, Long> {
}