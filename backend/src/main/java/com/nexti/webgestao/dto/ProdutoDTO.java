package com.nexti.webgestao.dto;

import java.io.Serializable;

import com.nexti.webgestao.entities.Produto;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String sku;
	private String nome;
	private String descricao;
	private Double preco;
	private Integer quantidade;

	public ProdutoDTO() {

	}

	public ProdutoDTO(Long id, String sku, String nome, String descricao, Double preco, Integer quantidade) {

		this.id = id;
		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public ProdutoDTO(Produto entity) {

		id = entity.getId();
		sku = entity.getSku();
		nome = entity.getNome();
		descricao = entity.getDescricao();
		preco = entity.getPreco();
		quantidade = entity.getQuantidade();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
