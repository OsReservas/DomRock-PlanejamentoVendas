package com.osreservas.projeto.dom.rock.dto;

import com.osreservas.projeto.dom.rock.entities.Produto;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {
    private static final long serialVersionUID = 1l;


    private Long id;
    private String nome;
    private String descricao;

    public ProdutoDTO(){

    }


    public ProdutoDTO(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }



    public ProdutoDTO(Produto entity){
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.descricao = entity.getDescricao();
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

        this.nome = nome;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }



}
