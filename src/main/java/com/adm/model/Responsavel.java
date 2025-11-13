package com.adm.model;

import com.adm.model.enums.TipoImovel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity(name = "responsavel")
public class Responsavel {

    @Column(name = "nome", length = 226)
    private String nome;

    @Column(name = "telefone", length = 20)
    private String telefone;

    @Column(name = "email", length = 100)
    private String email;

    public Responsavel() {}

    private Responsavel(Builder builder) {
        this.nome = builder.nome;
        this.telefone = builder.telefone;
        this.email = builder.email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
         this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class Builder {
        private String nome;
        private String telefone;
        private String email;
    }
}
