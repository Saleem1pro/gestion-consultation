package com.cabinet.cabinetmedicale.service;

import com.cabinet.cabinetmedicale.entities.Medecin;
import com.cabinet.cabinetmedicale.repository.MedecinRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinService {
    private final MedecinRepository medecinRepository;

    public MedecinService(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }
}
