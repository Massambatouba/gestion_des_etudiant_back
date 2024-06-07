package com.thiam.projetgestiondesetudiant.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Data
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateNaissance;
    private String email;
    private String photo;

    public Etudiant() {
        super();
    }

    public Etudiant(String name, LocalDate dateNaissance, String email, String photo) {
        this.name = name;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.photo = photo;
    }
}
