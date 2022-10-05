package com.example.AppDepartement.repository;

import com.example.AppDepartement.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
}