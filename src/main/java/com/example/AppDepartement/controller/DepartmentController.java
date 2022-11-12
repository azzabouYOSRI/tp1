package com.example.AppDepartement.controller;

import com.example.AppDepartement.Service.DepartementService;
import com.example.AppDepartement.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Departement")
public class DepartmentController {
    @Autowired
    private DepartementService departementService;

    @GetMapping("/allDepartement")
    public List<Departement> getAllDepartement(){
        return departementService.getAllDepartements();
    }

    @GetMapping("/DepartementById/{id}")
    public Departement getDepartementById(@PathVariable Long id){
        return departementService.getDepartementById(id);
    }

    @PostMapping("/addDepartement")
    public Departement saveDepartement(@Validated @RequestBody Departement departement){
        departementService.SaveDepartement(departement);
        //return the dep we just inserted
        return departement;
    }

    @DeleteMapping("/deleteDepartement/{id}")
        public  String deleteDepartement(@PathVariable Long id){
            departementService.deleteDepartement(id);
            return "Departement deleted";
        }
    @PutMapping("/updateDepartement/{id}")
    public ResponseEntity<?> updateDepartement(@PathVariable Long id, @RequestBody Departement departement){
        Departement departementExist = departementService.getDepartementById(id);
        departementExist.setNom(departement.getNom());
        System.out.println(departementExist.getId());
        departementService.SaveDepartement(departementExist);
        return ResponseEntity.ok().body(departementExist);
    }

}
