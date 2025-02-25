package com.cabinet.cabinetmedicale.web;

import com.cabinet.cabinetmedicale.entities.Consultation;
import com.cabinet.cabinetmedicale.entities.Medecin;
import com.cabinet.cabinetmedicale.entities.Patient;
import com.cabinet.cabinetmedicale.service.ConsultationService;
import com.cabinet.cabinetmedicale.service.MedecinService;
import com.cabinet.cabinetmedicale.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class MedicalController {
    private final MedecinService medecinService;
    private final PatientService patientService;
    private final ConsultationService consultationService;

    public MedicalController(MedecinService medecinService, PatientService patientService, ConsultationService consultationService) {
        this.medecinService = medecinService;
        this.patientService = patientService;
        this.consultationService = consultationService;
    }

    /***  Gestion des médecins ***/
    @GetMapping("/medecin")
    public String afficherMedecins(Model model) {
        List<Medecin> medecin = medecinService.getAllMedecins();
        model.addAttribute("medecin", medecin);
        return "medecin";
    }
    @GetMapping("/test-medecins")
    @ResponseBody
    public List<Medecin> testMedecins() {
        return medecinService.getAllMedecins();
    }

    /***  Gestion des patients ***/
    @GetMapping("/patient")
    public String afficherPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patient", patients);
        return "patient";
    }

    /***  Gestion des consultations ***/

    // Afficher le formulaire d'ajout
    @GetMapping("/consultation/ajouterConsultation")
    public String afficherFormulaireAjout(Model model) {
        model.addAttribute("consultation", new Consultation());
        model.addAttribute("medecins", medecinService.getAllMedecins());
        model.addAttribute("patients", patientService.getAllPatients());
        return "ajouterConsultation";
    }

    // Ajouter une consultation
    @PostMapping("/consultation/ajouterConsultation")
    public String ajouterConsultation(@ModelAttribute Consultation consultation) {
        consultationService.ajouterConsultation(consultation);
        return "redirect:/consultation/ajouterConsultation?success";
    }

    // Voir une consultation par référence
    @GetMapping("/consultation/voirConsultation")
    public String afficherConsultation(@RequestParam String reference, Model model) {
        Optional<Consultation> consultation = consultationService.getConsultationByReference(reference);

        if (consultation.isPresent()) {
            model.addAttribute("consultation", consultation.get());
        } else {
            model.addAttribute("consultation", null);
            model.addAttribute("message", "Aucune consultation trouvée avec cette référence.");
        }
        return "voirConsultation";
    }

    // Lister toutes les consultations
    @GetMapping("/consultation")
    public String listerConsultations(Model model) {
        List<Consultation> consultations = consultationService.getAllConsultations();
        model.addAttribute("consultations", consultations);
        return "listeConsultations"; // Créer une vue Thymeleaf correspondante
    }
}
