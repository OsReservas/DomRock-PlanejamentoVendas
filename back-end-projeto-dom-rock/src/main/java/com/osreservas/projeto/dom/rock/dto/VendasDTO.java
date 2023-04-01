package com.osreservas.projeto.dom.rock.dto;

import java.sql.Date;

import com.osreservas.projeto.dom.rock.entities.Vendas;

import lombok.Data;

@Data
public class VendasDTO {
	
	private Long id;
	private Integer quantidade;
	private Date data;

	public VendasDTO(){
	}
	public VendasDTO(Vendas vendas) {
		
		this.id = vendas.getId();
		this.quantidade = vendas.getQuantidade();
		this.data = (Date) vendas.getData();
		
		
	}

}
