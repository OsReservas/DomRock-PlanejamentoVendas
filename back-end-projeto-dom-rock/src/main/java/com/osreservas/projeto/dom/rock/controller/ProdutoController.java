package com.osreservas.projeto.dom.rock.controller;

import com.osreservas.projeto.dom.rock.dto.ProdutoDTO;
import com.osreservas.projeto.dom.rock.entities.Produto;
import com.osreservas.projeto.dom.rock.exceptions.DatabaseException;
import com.osreservas.projeto.dom.rock.exceptions.EntidadeNaoLocalizada;
import com.osreservas.projeto.dom.rock.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService Produtoservice;


    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll(){
        List<ProdutoDTO> list = Produtoservice.findAll();
        return ResponseEntity.ok().body(list);


    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProdutoDTO> findById(@PathVariable Long id) throws EntidadeNaoLocalizada {
        ProdutoDTO dto = Produtoservice.findById(id);
        return ResponseEntity.ok().body(dto);


    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> insert(@RequestBody ProdutoDTO dto){
         dto = Produtoservice.insert(dto);
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
        Produtoservice.delete(id);
        return ResponseEntity.noContent().build();

    }









}
