package com.adm.model;

import br.com.imobiliaria.model.Imovel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "status_imovel")
public class StatusImovel {

    @Column(name = "nome_status", length = 50)
    private String nomeStatus;

    @Column(name = "descricao", length = 255)
    private String descricao;

    public StatusImovel(){}

    public String getNomeStatus() {
        return nomeStatus;
    }

    public void setNomeStatus(String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
