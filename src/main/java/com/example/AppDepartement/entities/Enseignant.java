package com.example.AppDepartement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

/**
 * @author YOSRI AZABOU
 */
@Entity
@Table(name = "T_Enseignant")
public class Enseignant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", length = 30)
    private String nom;

    @Column(name = "prenom", length = 30)
    private String prenom;

    @Column(name = "grade", length = 30)
    private String grade;

    @Column(name = "address", length = 30)
    private String address;

    @Column(name = "numerotelephone", length = 30)
    private String numerotelephone;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "departement_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)

    private Departement departement;

    public Enseignant() {
    }

    public Enseignant(String nom, String prenom, String grade, String address, String numeroTelephoen) {
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        this.address = address;
        this.numerotelephone = numeroTelephoen;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getNumerotelephone() {
        return numerotelephone;
    }

    public void setNumerotelephone(String numerotelephone) {
        this.numerotelephone = numerotelephone;
    }
    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }




}