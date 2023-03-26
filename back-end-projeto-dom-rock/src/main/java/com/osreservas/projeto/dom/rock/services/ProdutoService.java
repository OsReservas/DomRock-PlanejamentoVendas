package com.osreservas.projeto.dom.rock.services;


import com.osreservas.projeto.dom.rock.dto.ProdutoDTO;
import com.osreservas.projeto.dom.rock.entities.Produto;
import com.osreservas.projeto.dom.rock.exceptions.EntityNotFoundException;
import com.osreservas.projeto.dom.rock.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


    @Transactional(readOnly = true)
    public List<ProdutoDTO> findAll() {
        List<Produto> list = repository.findAll();
        return list.stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());

    }


    @Transactional(readOnly = true)
    public ProdutoDTO findById(Long id) {
        Optional<Produto> obj = repository.findById(id);
        Produto entity = obj.orElseThrow(() -> new EntityNotFoundException("Produto nao cadastrado"));
        return new ProdutoDTO(entity);

    }

}
