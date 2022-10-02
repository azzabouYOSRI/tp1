import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/*
package com.yosriazabou.tp1.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity
@Table

public class Enseignant {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
@column(name = "id")
private Long id;
@column(name = "nom")
private String nom;
@column(name = "prenom")
private String prenom;
@column(name = "grade")
private String grade;
@column(name = "specialite")
private String specialite;
@column(name = "email")
    private String email;
@column(name = "telephone")
    private String telephone;
@JsonProperty({"hibernateLazyInitializer","handler"})
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "dept_id", referencedColumnName = "id")
@column(name = "departement")
    private String departement;


    public Enseignant(long id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public Enseignant() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

 */