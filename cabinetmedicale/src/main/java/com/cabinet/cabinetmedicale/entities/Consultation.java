package com.cabinet.cabinetmedicale.entities;

import com.cabinet.cabinetmedicale.entities.Patient;
import jakarta.persistence.*;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate dateConsultation;
    private String description;

    @ManyToOne
    @JoinColumn(name = "medecin_id", referencedColumnName = "id")
    private Medecin medecin;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;

    private String reference;

    @PrePersist
    public void generateReference() {
        this.reference = UUID.randomUUID().toString();
    }
}
