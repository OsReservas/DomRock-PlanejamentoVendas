package com.osreservas.projeto.dom.rock.controller;

import com.osreservas.projeto.dom.rock.entities.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/produtos")
public class CategoryController {

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        List<Produto> list = new ArrayList<>();
        list.add(new Produto(1L, "tubo aco", "tubo de aco galvanizado de 2m"));
        list.add(new Produto(1L, "chapa aco", "chapa de aco de 2m"));

        return ResponseEntity.ok().body(list);


    }







}
