package com.osreservas.projeto.dom.rock.controller;

import com.osreservas.projeto.dom.rock.dto.VendasDTO;
import com.osreservas.projeto.dom.rock.entities.Vendas;
import com.osreservas.projeto.dom.rock.exceptions.DatabaseException;
import com.osreservas.projeto.dom.rock.exceptions.EntidadeNaoLocalizada;
import com.osreservas.projeto.dom.rock.services.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/vendas")
public class VendasController {

	@Autowired
	private VendasService vendasService;


	@GetMapping
	public ResponseEntity<List<Vendas>> findAll(){

		List<Vendas> list = vendasService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<VendasDTO> findById(@PathVariable Long id) throws EntidadeNaoLocalizada {
		VendasDTO dto = vendasService.findById(id);
		return ResponseEntity.ok().body(dto);


	}

	@PostMapping
	public ResponseEntity<VendasDTO> insert(@RequestBody VendasDTO dto){
		dto = vendasService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);


	}


//    @PutMapping(value = "/{id}")
//    public ResponseEntity<ProdutoDTO> update(@PathVariable Long id, @RequestBody ProdutoDTO dto) {
//        dto = Produtoservice.update(dto);
//        return ResponseEntity.ok().body(dto);
//
//
//    }


	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete (@PathVariable Long id) throws DatabaseException, EntidadeNaoLocalizada {
		vendasService.delete(id);
		return ResponseEntity.noContent().build();

	}









}
