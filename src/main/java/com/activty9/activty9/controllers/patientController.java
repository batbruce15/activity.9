package com.activty9.activty9.controllers;

import com.activty9.activty9.models.patient;
import com.activty9.activty9.services.patientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class patientController {
    @Autowired
    private patientService pService;
    @GetMapping("/getall")
    public List<patient> getAllPatients(){
        return pService.getAll();
    }

    @GetMapping("/nom/{nom_utilisateur}")
    public List<patient> getAgentByName(@PathVariable String nom_utilisateur) {
        return pService.getPatientByName(nom_utilisateur);
    }

    @PostMapping("/add")
    public void createPatient(@RequestBody patient pat) {
        System.out.println("test");
        pService.createPatient(pat);
    }
}
