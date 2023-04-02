package com.osreservas.projeto.dom.rock.dto;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.osreservas.projeto.dom.rock.entities.Produto;
import com.osreservas.projeto.dom.rock.entities.Vendas;





public class VendasDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private Integer quantidade;
	private LocalDate data;

	private String cliente;

	private List<ProdutoDTO> produtos = new ArrayList<>();


	public VendasDTO(){

	}


	public VendasDTO(Long id, Integer quantidade, LocalDate data, String cliente) {
		this.id = id;
		this.quantidade = quantidade;
		this.data = data;
		this.cliente = cliente;
	}

	public VendasDTO(Vendas entity) {
		this.id = entity.getId();
		this.quantidade = entity.getQuantidade();
		this.data = entity.getData();
		this.cliente = entity.getCliente();

	}


	public VendasDTO(Vendas entity, Set<Produto> produtos){
		this(entity);
		produtos.forEach(x -> this.produtos.add(new ProdutoDTO(x)));

	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
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
		VendasDTO vendasDTO = (VendasDTO) o;
		return Objects.equals(id, vendasDTO.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	public List<ProdutoDTO> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<ProdutoDTO> produtos) {
		this.produtos = produtos;
	}





}
