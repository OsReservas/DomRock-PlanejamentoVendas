package com.osreservas.projeto.dom.rock.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "tb_vendas")
public class Vendas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant data;
    private Integer quantidade;

    private String cliente;



    @ManyToMany
    @JoinTable(name = "tb_produto_venda",
            joinColumns = @JoinColumn (name = "venda_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id"))
    Set<Produto> produtos = new HashSet<>();


    public Set<Produto> getProdutos() {
        return produtos;
    }


    public Vendas(){
    }

    public Vendas(Long id, Instant data, Integer quantidade, String cliente) {
        this.id = id;
        this.data = data;
        this.quantidade = quantidade;
        this.cliente = cliente;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendas vendas = (Vendas) o;
        return id.equals(vendas.id);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
