package com.nexti.webgestao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexti.webgestao.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {



}
