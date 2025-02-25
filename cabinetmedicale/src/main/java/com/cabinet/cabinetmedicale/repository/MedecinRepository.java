package com.cabinet.cabinetmedicale.repository;

import com.cabinet.cabinetmedicale.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {
}
