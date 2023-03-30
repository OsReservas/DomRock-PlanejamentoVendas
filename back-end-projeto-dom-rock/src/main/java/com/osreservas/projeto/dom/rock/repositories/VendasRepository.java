package com.osreservas.projeto.dom.rock.repositories;

import com.osreservas.projeto.dom.rock.entities.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long> {
}
