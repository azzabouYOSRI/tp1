package com.example.AppDepartement.controller;

import com.example.AppDepartement.Service.DepartementService;
import com.example.AppDepartement.Service.EnseignantServices;
import com.example.AppDepartement.entities.Departement;
import com.example.AppDepartement.entities.Enseignant;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Enseignant")
public class EnseignantController
{
    @Autowired
    private EnseignantServices enseignantServices;

//    @PostMapping("/addEnseignant")
@PostMapping(
        value = "/addEnseignant",
        consumes = "application/json")
    public Enseignant saveEnseignant(@Validated @RequestBody Enseignant enseignant){

        enseignantServices.saveEnseignant(enseignant);
        //return the dep we just inserted
        return enseignant;
    }
//
    @DeleteMapping("/deleteEnseignant/{id}")
    public String deleteEnseignant(@PathVariable Long id){
        return "Enseignant deleted";
    }

    @GetMapping("/getEnseignant/{id}")
    public String getEnseignant(@PathVariable Long id){
        return "Enseignant found";
    }

    @GetMapping("/getallempbydep/{id}")
    public List<Enseignant> findAllEnsDep(@PathVariable Long id){
        return enseignantServices.findAllEnsDep(id);
    }

    @GetMapping("/GetEnsByGrade/{grade}")
    public List<Enseignant> findAllEnsByGrade(@PathVariable String grade){
        return enseignantServices.findAllEnsGrade(grade);
    }

    @GetMapping("/GetEnsByDepAndGrade/{id}/{grade}")
    public List<Enseignant> findAllEnsByDepAndGrade(@PathVariable Long id, @PathVariable String grade){
        return enseignantServices.findAllEnsDepAndGrade(id, grade);
    }


}
