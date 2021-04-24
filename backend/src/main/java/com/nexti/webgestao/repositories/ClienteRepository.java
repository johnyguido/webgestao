package com.nexti.webgestao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexti.webgestao.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findAllByOrderByNomeAsc();

}
