package com.osreservas.projeto.dom.rock.services;


import com.osreservas.projeto.dom.rock.dto.VendasDTO;
import com.osreservas.projeto.dom.rock.entities.Vendas;
import com.osreservas.projeto.dom.rock.exceptions.DatabaseException;
import com.osreservas.projeto.dom.rock.exceptions.EntidadeNaoLocalizada;
import com.osreservas.projeto.dom.rock.repositories.ProdutoRepository;

import com.osreservas.projeto.dom.rock.repositories.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;


@Service
public class VendasService {

	@Autowired
	private VendasRepository repository;




	@Transactional(readOnly = true)
	public List<Vendas> findAll(){
		return repository.findAll();
	}




	@Transactional(readOnly = true)
	public VendasDTO findById(Long id) throws EntidadeNaoLocalizada {
		Optional<Vendas> obj = repository.findById(id);
		Vendas entity = obj.orElseThrow(() -> new EntidadeNaoLocalizada("Recurso nao Localizado"));
		return new VendasDTO(entity);

	}

	@Transactional
	public VendasDTO insert(VendasDTO dto) {
		Vendas entity = new Vendas();
		entity.setData(dto.getData());
		entity.setQuantidade(dto.getQuantidade());
		entity = repository.save(entity);
		return new VendasDTO(entity);


	}


	@Transactional
	public VendasDTO update(Long id, VendasDTO dto) throws EntidadeNaoLocalizada {
		try {
			Vendas entity = repository.getReferenceById(id);
			entity.setData(dto.getData());
			entity.setQuantidade(dto.getQuantidade());
			entity = repository.save(entity);
			return new VendasDTO(entity);
		}
		catch (EntityNotFoundException e)
		{
			throw new EntidadeNaoLocalizada("Id nao Localizado " + id);
		}
	}




	public void delete(Long id) throws DatabaseException, EntidadeNaoLocalizada {
		try {
			repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e){
			throw new EntidadeNaoLocalizada("Id Not Found: " + id);
		}
		catch (DataIntegrityViolationException e){
			throw new DatabaseException("Integrity Violation");
		}
	}







}
