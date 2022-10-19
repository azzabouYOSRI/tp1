package com.example.AppDepartement.Service;

import com.example.AppDepartement.entities.Departement;
import com.example.AppDepartement.repository.DepartementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartementService {
    private final DepartementRepository departementRepository;

    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @Transactional
    public Departement getAllDepartement() {
        return (Departement) departementRepository.findAll();
    }
    @Transactional
    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }
}