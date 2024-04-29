package com.activty9.activty9.controllers;

import com.activty9.activty9.models.rendezVous;
import com.activty9.activty9.models.traitement;
import com.activty9.activty9.services.rendezVousService;
import com.activty9.activty9.services.traitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/traitement")
public class traitementController {
    @Autowired
    private traitementService tService;
    @GetMapping("/getall")
    public List<traitement> getAlltraitement(){  return tService.getAll(); }
}
