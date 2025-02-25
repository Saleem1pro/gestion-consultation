package com.cabinet.cabinetmedicale.repository;

import com.cabinet.cabinetmedicale.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    Optional<Consultation> findByReference(String reference);
}
