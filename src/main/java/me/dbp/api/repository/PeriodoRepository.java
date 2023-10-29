package me.dbp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dbp.api.entity.Periodo;

public interface PeriodoRepository extends JpaRepository<Periodo, Long> {
}