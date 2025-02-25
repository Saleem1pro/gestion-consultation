package com.cabinet.cabinetmedicale.repository;

import com.cabinet.cabinetmedicale.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
