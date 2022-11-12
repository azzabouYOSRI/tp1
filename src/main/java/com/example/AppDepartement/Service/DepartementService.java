package com.example.AppDepartement.Service;

import com.example.AppDepartement.entities.Departement;
import com.example.AppDepartement.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartementService {
    @Autowired
    private  DepartementRepository departementRepository;


    @Transactional
    public Departement getAllDepartement() {
        return (Departement) departementRepository.findAll();
    }
    @Transactional
    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }

    @Transactional
    public Departement getDepartementById(Long id) {
        return departementRepository.findById(id).get();
    }
    @Transactional
    public void SaveDepartement(Departement departement) {
        departementRepository.save(departement);
    }

    @Transactional
    public void deleteDepartement(Long id) {
        departementRepository.deleteById(id);
    }








}
