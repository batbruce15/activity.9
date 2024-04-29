package com.activty9.activty9.controllers;

import com.activty9.activty9.models.patient;
import com.activty9.activty9.models.rendezVous;
import com.activty9.activty9.services.patientService;
import com.activty9.activty9.services.rendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rendezVous")
public class rendezVousController {
    @Autowired
    private rendezVousService rService;
    @GetMapping("/getall")
    public List<rendezVous> getAllRendezVous(){
        return rService.getAll();
    }
}
