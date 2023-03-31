package com.osreservas.projeto.dom.rock.dto;

import java.sql.Date;

import com.osreservas.projeto.dom.rock.entities.Vendas;

import lombok.Data;

@Data
public class VendasDTO {
	
	private Long id;
	private Integer quantidade;
	private Date date;
	
	public VendasDTO(Vendas vendas) {
		
		this.id = vendas.getId();
		this.quantidade = vendas.getQuantidade();
		this.date = (Date) vendas.getData();
		
		
	}

}
