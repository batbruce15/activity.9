package com.activty9.activty9.mappers;

import com.activty9.activty9.models.ligneConsultation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface lignConsultationMapper {
    List<ligneConsultation> getAll();
    ligneConsultation getById(int id);
}
