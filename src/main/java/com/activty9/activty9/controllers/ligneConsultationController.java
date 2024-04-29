package com.activty9.activty9.controllers;

import com.activty9.activty9.models.consultation;
import com.activty9.activty9.models.ligneConsultation;
import com.activty9.activty9.services.consultationService;
import com.activty9.activty9.services.ligneConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ligneconsultations")
public class ligneConsultationController {
    @Autowired
    private ligneConsultationService lService;
    @GetMapping("/getall")
    public List<ligneConsultation> getAllligneConsultations(){
        return lService.getAll();
    }
}
