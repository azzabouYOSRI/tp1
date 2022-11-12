package com.example.AppDepartement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

/**
 * @author YOSRI AZABOU
 */
@Entity
@Table(name = "t_Enseignant")
public class Enseignant implements java.io.Serializable {
    @ManyToMany(mappedBy = "enseignant")
    List<Student>students;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ens;

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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "departement_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)

    private Departement departement;

    public Enseignant() {
    }

    public Enseignant(Long id_ens,String nom, String prenom, String grade, String address, String numeroTelephoen) {
        this.id_ens = id_ens;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        this.address = address;
        this.numerotelephone = numeroTelephoen;
    }

    public Enseignant(String nom, String prenom, String email, String password, String adresse, int codePostal, String dateNaissance) {
    }

    public Long getId() {
        return id_ens;
    }

    public void setId(Long id) {
        this.id_ens = id;
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

    public Enseignant(String nom, String prenom, String grade, String address, String numerotelephone, Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        this.address = address;
        this.numerotelephone = numerotelephone;
        this.departement = departement;
    }



    public Enseignant(List<Student> students, String nom, String prenom, String grade, String address, String numerotelephone, Departement departement) {
        this.students = students;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        this.address = address;
        this.numerotelephone = numerotelephone;
        this.departement = departement;
    }


    public Enseignant(List<Student> students, Long id_ens, String nom, String prenom, String grade, String address, String numerotelephone, Departement departement) {
        this.students = students;
        this.id_ens = id_ens;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        this.address = address;
        this.numerotelephone = numerotelephone;
        this.departement = departement;
    }
}
