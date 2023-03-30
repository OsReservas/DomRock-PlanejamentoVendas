package com.osreservas.projeto.dom.rock.services;


import com.osreservas.projeto.dom.rock.dto.ProdutoDTO;
import com.osreservas.projeto.dom.rock.entities.Produto;
import com.osreservas.projeto.dom.rock.exceptions.DatabaseException;
import com.osreservas.projeto.dom.rock.exceptions.EntidadeNaoLocalizada;
import com.osreservas.projeto.dom.rock.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;


@Service
public class VendasService {

    @Autowired
    private ProdutoRepository repository;




    @Transactional(readOnly = true)
    public Page<ProdutoDTO> findAllPaged(PageRequest pageRequest) {
        Page<Produto> list = repository.findAll(pageRequest);
        return list.map(x -> new ProdutoDTO(x));


    }




    @Transactional(readOnly = true)
    public ProdutoDTO findById(Long id) throws EntidadeNaoLocalizada {
        Optional<Produto> obj = repository.findById(id);
        Produto entity = obj.orElseThrow(() -> new EntidadeNaoLocalizada("Recurso nao Localizado"));
        return new ProdutoDTO(entity);

    }

    @Transactional
    public ProdutoDTO insert(ProdutoDTO dto) {
        Produto entity = new Produto();
        entity.setNome(dto.getNome());
        entity.setDescricao(dto.getDescricao());
        entity = repository.save(entity);
        return new ProdutoDTO(entity);


    }


    @Transactional
    public ProdutoDTO update(Long id, ProdutoDTO dto) throws EntidadeNaoLocalizada {
        try {
            Produto entity = repository.getReferenceById(id);
            entity.setNome(dto.getNome());
            entity.setDescricao(dto.getDescricao());
            entity = repository.save(entity);
            return new ProdutoDTO(entity);
            }
            catch (EntityNotFoundException e)
            {
                throw new EntidadeNaoLocalizada("Id nao Localizado" + id);
            }
    }




    public void delete(Long id) throws DatabaseException, EntidadeNaoLocalizada {
        try {
            repository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e){
            throw new EntidadeNaoLocalizada("Id Not Found" + id);
        }
        catch (DataIntegrityViolationException e){
            throw new DatabaseException("Integrity Violation");
        }
    }







}
