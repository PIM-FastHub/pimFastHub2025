package com.projetoFastHub.fasthub.servico;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "SERVICO")
public class ServicoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
    private String descricao;
    private Calendar dataInclusao;
    private Calendar dataAlteracao;

    public ServicoModel() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome Inválido");
        }

        this.nome = nome;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao != null || descricao.isEmpty()){
            throw new IllegalArgumentException("Descrição Inválido");
        }

        this.descricao = descricao;
    }

    public Calendar getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Calendar dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Calendar getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Calendar dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
}
