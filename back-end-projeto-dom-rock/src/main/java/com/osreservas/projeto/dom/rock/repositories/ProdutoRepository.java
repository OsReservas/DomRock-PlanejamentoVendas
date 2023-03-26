package com.osreservas.projeto.dom.rock.repositories;

import com.osreservas.projeto.dom.rock.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
