package com.nexti.webgestao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexti.webgestao.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
