package me.dbp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dbp.api.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}