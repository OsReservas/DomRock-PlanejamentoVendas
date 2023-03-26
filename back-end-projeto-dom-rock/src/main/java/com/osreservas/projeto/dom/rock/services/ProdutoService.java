package com.osreservas.projeto.dom.rock.services;


import com.osreservas.projeto.dom.rock.entities.Produto;
import com.osreservas.projeto.dom.rock.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


    public List<Produto> findAll(){
        return repository.findAll();


    }



}
