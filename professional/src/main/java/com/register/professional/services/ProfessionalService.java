package com.register.professional.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.professional.model.Professional;
import com.register.professional.repositories.ProfessionalRepository;

@Service // mostrar que realmente é um service 
public class ProfessionalService {

    @Autowired
    private ProfessionalRepository  professionalRepository;

    public List<Professional> getProfessional() {
        return professionalRepository.findAll();
    }
}
