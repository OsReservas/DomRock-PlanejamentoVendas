package com.osreservas.projeto.dom.rock.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osreservas.projeto.dom.rock.dto.VendasDTO;
import com.osreservas.projeto.dom.rock.entities.Vendas;
import com.osreservas.projeto.dom.rock.repositories.VendasRepository;
import com.osreservas.projeto.dom.rock.services.VendasService;

@RestController
@RequestMapping("/vendas")
public class VendasController {
	
	private final VendasService vendasService;
	
	@Autowired
	public VendasController(VendasService vendasService) {
		this.vendasService = vendasService;
	}
	
	@GetMapping
	public ResponseEntity<List<Vendas>>listarTodos(){
		List<Vendas>vendas = vendasService.list
	}

}
