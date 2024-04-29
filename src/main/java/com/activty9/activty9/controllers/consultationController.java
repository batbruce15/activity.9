package com.activty9.activty9.controllers;

import com.activty9.activty9.models.consultation;
import com.activty9.activty9.models.patient;
import com.activty9.activty9.services.consultationService;
import com.activty9.activty9.services.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/consultations")
public class consultationController {
    @Autowired
    private consultationService cService;
    @GetMapping("/getall")
    public List<consultation> getAllConsultations(){
        return cService.getAll();
    }

    @GetMapping("/{id}")
    public consultation getAgentById(@PathVariable int id) {
        return cService.getConsultationById(id);
    }
}
