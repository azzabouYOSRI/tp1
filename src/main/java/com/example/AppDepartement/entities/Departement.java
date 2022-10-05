package com.example.AppDepartement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_Departement")
public class Departement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "nom", length = 30)
    private String nom;

    @JsonIgnore
    @OneToMany(mappedBy = "departement")
    private List<Enseignant> enseignant;

    public Departement(Long id, String nom, List<Enseignant> enseignant) {
        this.id = id;
        this.nom = nom;
        this.enseignant = enseignant;
    }

    public Departement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Enseignant> getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(List<Enseignant> enseignant) {
        this.enseignant = enseignant;
    }

}