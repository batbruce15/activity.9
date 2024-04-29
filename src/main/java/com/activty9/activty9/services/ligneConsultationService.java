package com.activty9.activty9.services;

import com.activty9.activty9.mappers.consultationMapper;
import com.activty9.activty9.mappers.lignConsultationMapper;
import com.activty9.activty9.models.consultation;
import com.activty9.activty9.models.ligneConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ligneConsultationService {
    @Autowired
    lignConsultationMapper lMapper;
    public List<ligneConsultation> getAll(){
        return lMapper.getAll();
    }
}
