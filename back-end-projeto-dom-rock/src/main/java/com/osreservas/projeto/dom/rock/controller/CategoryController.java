package com.osreservas.projeto.dom.rock.controller;

import com.osreservas.projeto.dom.rock.entities.Produto;
import com.osreservas.projeto.dom.rock.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/produtos")
public class CategoryController {

    @Autowired
    private ProdutoService Produtoservice;


    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        List<Produto> list = Produtoservice.findAll();
        return ResponseEntity.ok().body(list);


    }







}
