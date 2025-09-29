package com.dev.CadastroDeChamados;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_cadastro")
public class ModelChamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String chamado;
    Date data;

    public ModelChamado() {}

    public ModelChamado(String chamado, Date data) {
        this.chamado = chamado;
        this.data = data;
    }

    public String getChamado() {
        return chamado;
    }

    public void setChamado(String chamado) {
        this.chamado = chamado;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
