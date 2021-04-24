package com.nexti.webgestao.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexti.webgestao.dto.PedidoDTO;
import com.nexti.webgestao.dto.ProdutoDTO;
import com.nexti.webgestao.entities.ItemPedido;
import com.nexti.webgestao.entities.Pedido;
import com.nexti.webgestao.entities.Produto;
import com.nexti.webgestao.repositories.PedidoRepository;
import com.nexti.webgestao.repositories.ProdutoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	private ItemPedido ItemPedido;

	@Transactional(readOnly = true)
	public List<PedidoDTO> findAll() {
		List<Pedido> lista = repository.findAll();
		return lista.stream().map(x -> new PedidoDTO(x)).collect(Collectors.toList());
	}

	@Transactional
	public PedidoDTO insert(PedidoDTO dto) {
		Pedido pedido = new Pedido(null, dto.getTotalCompra(), Instant.now());
		for (ProdutoDTO p : dto.getProdutos()) {
			Produto produto = produtoRepository.getOne(p.getId());
			pedido.getItems().add(ItemPedido);
			
		}

		pedido = repository.save(pedido);
		return new PedidoDTO(pedido);
	}

}
