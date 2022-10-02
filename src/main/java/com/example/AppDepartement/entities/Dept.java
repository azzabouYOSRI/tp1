/*
package com.yosriazabou.tp1.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table

public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
    private Long id;
@Column(name = "nom")
private String nom;
@JsonIgnore
@OneToMany(mappedBy = "Dept");
@Column(name = "description")
    private String description;

    public Dept(String nom, long id, String description) {
        this.nom = nom;
        this.id = id;
        this.description = description;
    }

    public Dept() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = Long.valueOf(id);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    }
 */