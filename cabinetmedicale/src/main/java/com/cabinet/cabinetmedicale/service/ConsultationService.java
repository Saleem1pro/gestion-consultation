package com.cabinet.cabinetmedicale.service;

import com.cabinet.cabinetmedicale.entities.Consultation;
import com.cabinet.cabinetmedicale.repository.ConsultationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultationService {
    private final ConsultationRepository consultationRepository;

    public ConsultationService(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public Consultation ajouterConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    public Optional<Consultation> getConsultationByReference(String reference) {
        return consultationRepository.findByReference(reference);
    }

    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }
}
