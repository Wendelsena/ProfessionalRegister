package com.register.professional.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.professional.model.Professional;
import com.register.professional.services.ProfessionalService;

@RestController // inicia a EndPoint
@RequestMapping("professional") // controle de profissionais
public class ProfessionalController {

    @Autowired
    private ProfessionalService professionalService;

    @GetMapping  // joga a função ao RequestMapping
    public List<Professional> getProfessional() {
        return professionalService.getProfessional();
    }

    @GetMapping("{id}")
    public Professional getProfessionalById(@PathVariable int id) { // @PathVariable para dizer que o /id será o dado int
        return professionalService.getProfessionalById(id);
    }

}

