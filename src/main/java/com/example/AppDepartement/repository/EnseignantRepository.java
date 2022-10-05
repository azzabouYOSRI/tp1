package com.example.AppDepartement.repository;

import com.example.AppDepartement.entities.Enseignant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long>{

}