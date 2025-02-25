package com.cabinet.cabinetmedicale.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "specialite")
    private String specialite;

    @Column(name = "email")
    private String email;
}
