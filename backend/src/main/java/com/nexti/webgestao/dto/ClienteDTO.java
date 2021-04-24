package com.nexti.webgestao.dto;

import java.io.Serializable;
import java.util.Date;

import com.nexti.webgestao.entities.Cliente;

public class ClienteDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	
	public ClienteDTO() {
		
	}

	public ClienteDTO(Long id, String nome, String cpf, Date dataNascimento) {
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public ClienteDTO(Cliente entity) {
		
		id = entity.getId();
		nome = entity.getNome();
		cpf = entity.getCpf();
		dataNascimento = entity.getDataNascimento();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	

}
