package com.activty9.activty9.services;

import com.activty9.activty9.mappers.rendezVousMapper;
import com.activty9.activty9.models.rendezVous;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class rendezVousService {
    @Autowired
    rendezVousMapper rMapper;
    public List<rendezVous> getAll(){
        return rMapper.getAll();
    }
}
