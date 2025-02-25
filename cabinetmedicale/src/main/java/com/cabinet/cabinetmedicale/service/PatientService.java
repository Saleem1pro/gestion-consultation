package com.cabinet.cabinetmedicale.service;

import com.cabinet.cabinetmedicale.entities.Patient;
import com.cabinet.cabinetmedicale.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
