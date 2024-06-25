package com.register.professional.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.professional.model.Professional;
import com.register.professional.repositories.ProfessionalRepository;

import jakarta.persistence.EntityNotFoundException;

@Service // mostrar que realmente é um service 
public class ProfessionalService {

    @Autowired
    private ProfessionalRepository  professionalRepository;

    // retorna todos os profissionais
    public List<Professional> getProfessional() {
        return professionalRepository.findAll();
    }

    
    // retorta o profissional pelo ID
    public Professional getProfessionalById(int id) {
        return professionalRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Profissional não encontrado :("));

    }

    // deleta o profissional pelo ID
    public void deleteProfessionalById(int id) {
        if(this.professionalRepository.existsById(id)) {
            this.professionalRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Profissional nao encontrado!");
        }
    }
}
