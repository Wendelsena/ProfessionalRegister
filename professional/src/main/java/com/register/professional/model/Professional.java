package com.register.professional.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // digo que a classe Professional agora é uma entidade relacional (Banco de Dados)
@Table(name = "TBL_PROFESSIONAL") // define o nome da tabela
public class Professional {

    @Id // define a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // define um valor automatico ao id (chave primaria)
    private Integer id;

    @Column(length = 40) // define o maximo de caracteres para nome
    private String nome;
    private String valorHora;
    private String area;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValorHora() {
        return valorHora;
    }

    public void setValorHora(String valorHora) {
        this.valorHora = valorHora;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
