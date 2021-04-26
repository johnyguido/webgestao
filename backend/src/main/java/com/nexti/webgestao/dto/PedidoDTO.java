package com.nexti.webgestao.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.nexti.webgestao.entities.Pedido;

public class PedidoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Double totalCompra;
	private Instant dataCompra;

	private List<ProdutoDTO> produtos = new ArrayList<>();

	private List<ClienteDTO> clientes = new ArrayList<>();

	public PedidoDTO() {

	}

	public PedidoDTO(Long id, Double totalCompra, Instant dataCompra) {

		this.id = id;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
	}

	public PedidoDTO(Pedido entity) {

		id = entity.getId();
		totalCompra = entity.getTotalCompra();
		dataCompra = entity.getDataCompra();
		

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}

	public Instant getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Instant dataCompra) {
		this.dataCompra = dataCompra;
	}

	public List<ProdutoDTO> getProdutos() {
		return produtos;
	}

	public List<ClienteDTO> getClientes() {
		return clientes;
	}

}
