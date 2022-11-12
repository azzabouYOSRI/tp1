package com.example.AppDepartement.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_student")
public class Student implements java.io.Serializable {

    @ManyToMany
    @JoinTable(
            name = "ens_etud2",
            joinColumns = @JoinColumn(name = "id_ens"),
            inverseJoinColumns = @JoinColumn(name = "id_etud"))

    List<Enseignant> enseignant;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_etud;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "Last name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateEntrer", nullable = false)
    private String dateEntrer;




    public Student() {
    }

    public Student(Long id_etud, String name, String lastName, String email, String dateEntrer) {
        this.id_etud = id_etud;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dateEntrer = dateEntrer;
    }

    public Long getId() {
        return id_etud;
    }

    public void setId(Long id_etud) {
        this.id_etud = id_etud;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateEntrer() {
        return dateEntrer;
    }

    public void setDateEntrer(String dateEntrer) {
        this.dateEntrer = dateEntrer;
    }
}
