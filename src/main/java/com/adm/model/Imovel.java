package br.com.imobiliaria.model;

import com.adm.model.Responsavel;
import com.adm.model.StatusImovel;
import com.adm.model.enums.TipoImovel;
import jakarta.persistence.*;

@Entity
@Table(name = "imovel")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_imovel;

    @Column(nullable = false)
    private String endereco;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private TipoImovel tipo;

    private Double valor;

    @Column(length = 500)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "id_responsavel", nullable = false)
    private Responsavel responsavel;

    @ManyToOne
    @JoinColumn(name = "id_status", nullable = false)
    private StatusImovel status;


    public Imovel() {
    }

    private Imovel(Builder builder) {
        this.endereco = builder.endereco;
        this.tipo = builder.tipo;
        this.valor = builder.valor;
        this.observacoes = builder.observacoes;
        this.responsavel = builder.responsavel;
        this.status = builder.status;
    }

    public Integer getId_imovel() {
        return id_imovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoImovel getTipo() {
        return tipo;
    }

    public void setTipo(TipoImovel tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public StatusImovel getStatus() {
        return status;
    }

    public void setStatus(StatusImovel status) {
        this.status = status;
    }


    public static class Builder {
        private String endereco;
        private TipoImovel tipo;
        private Double valor;
        private String observacoes;
        private Responsavel responsavel;
        private StatusImovel status;

        public Builder comEndereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder doTipo(TipoImovel tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder comValor(Double valor) {
            this.valor = valor;
            return this;
        }

        public Builder comObservacoes(String observacoes) {
            this.observacoes = observacoes;
            return this;
        }

        public Builder comResponsavel(Responsavel responsavel) {
            this.responsavel = responsavel;
            return this;
        }

        public Builder comStatus(StatusImovel status) {
            this.status = status;
            return this;
        }

        public Imovel build() {
            return new Imovel(this);
        }
    }
}
