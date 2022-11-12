package com.example.AppDepartement.Service;

import com.example.AppDepartement.entities.Enseignant;
import com.example.AppDepartement.repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EnseignantServices {

    @Autowired
    private  EnseignantRepository enseignantRepository;

    @Transactional
    public Enseignant saveEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    @Transactional
    public void deleteEnseignant(Long id) {
        enseignantRepository.deleteById(id);
    }

    @Transactional
    public void getEnseignantById(Long id) {
        enseignantRepository.findById(id);
    }

    @Transactional
    public List<Enseignant> findAllEnsDep(Long id) {
        return enseignantRepository.findEnseignantByDepartement(id);
    }

    @Transactional
    public List<Enseignant> findAllEnsGrade(String grade) {
        return enseignantRepository.findEnseignantByGrade(grade);
    }

    @Transactional
    public List<Enseignant> findAllEnsDepAndGrade(Long id, String grade) {
        return enseignantRepository.findEnseignantByDepartementAndGrade(id, grade);
    }
}
