package me.dbp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dbp.api.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}