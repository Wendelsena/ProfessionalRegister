package com.register.professional.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.professional.model.Professional;

@RestController // inicia a EndPoint
@RequestMapping("professional") // controle de profissionais
public class ProfessionalController {

    @GetMapping  // joga a função ao RequestMapping
    public List<Professional> getProfessional() {

        Professional p1 = new Professional(); // construindo um obj do tipo Professional();
        //definindo informações
        p1.setId(1);
        p1.setNome("Wendel");
        p1.setValorHora("R$300,00");
        p1.setArea("Segurança da Informação");

        Professional p2 = new Professional();
        p2.setId(2);
        p2.setNome("Alefe");
        p2.setValorHora("R$800,00");
        p2.setArea("Ánalise de Sistemas");

        Professional p3 = new Professional();
        p3.setId(3);
        p3.setNome("Julia");
        p3.setValorHora("R$600,00");
        p3.setArea("Psicóloga");

        ArrayList<Professional> listaP = new ArrayList<Professional>();
        listaP.add(p1);
        listaP.add(p2);
        listaP.add(p3);

        return listaP;

    }
}
