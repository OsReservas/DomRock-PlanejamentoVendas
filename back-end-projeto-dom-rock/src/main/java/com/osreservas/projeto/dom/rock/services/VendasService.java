package com.osreservas.projeto.dom.rock.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osreservas.projeto.dom.rock.entities.Vendas;
import com.osreservas.projeto.dom.rock.repositories.VendasRepository;

@Service
public class VendasService {
	
	private final VendasRepository vendasRepository;
	
	
	@Autowired
	
	public VendasService(VendasRepository vendaRepository) {
		this.vendasRepository = vendaRepository;
	}
	
	public List<Vendas>listarTodos(){
		return vendasRepository.findAll();
	}
	
	public Optional<Vendas>buscarPorId(Long id){
		return vendasRepository.findById(id);
	}
	
	public Vendas salvar(Vendas vendas) {
		return vendasRepository.save(vendas);
	}
	
	public void excluir(Long id) {
		vendasRepository.deleteById(id);
	}
	

}
