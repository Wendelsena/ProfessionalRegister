package com.register.professional.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.register.professional.model.Professional;

// intreface para operações sql
public interface ProfessionalRepository extends JpaRepository<Professional, Integer>{ 

    
}
