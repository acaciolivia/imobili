package com.adm.model;

import com.adm.model.enums.TipoImovel;
import jakarta.persistence.*;


@Table
@Entity(name = "imovel")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idImovel;

    @Column(name = "endereco", nullable = false, length = 255)
    private String endereco;

    @Column(name = "observacao")
    private String observacao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private TipoImovel tipoImovel;

    @Column(name = "valor", length = 50)
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "id_responsavel", nullable = false)
    private Responsavel responsavel;

    @ManyToOne
    @JoinColumn(name = "id_status", nullable = false)
    private statusImovel statusImovel;
}
