package me.dbp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dbp.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}