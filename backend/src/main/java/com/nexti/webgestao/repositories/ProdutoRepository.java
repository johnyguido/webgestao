package com.nexti.webgestao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexti.webgestao.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findAllByOrderByNomeAsc();

}
