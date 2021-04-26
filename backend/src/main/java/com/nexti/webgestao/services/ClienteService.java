package com.nexti.webgestao.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexti.webgestao.dto.ClienteDTO;
import com.nexti.webgestao.entities.Cliente;
import com.nexti.webgestao.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	@Transactional(readOnly = true)
	public List<ClienteDTO> findAll() {
		List<Cliente> lista = repository.findAll();
		return lista.stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
	}

	@Transactional
	public ClienteDTO insert(ClienteDTO dto) {
		Cliente entity = new Cliente();
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setNascimento(dto.getNascimento());
		entity = repository.save(entity);
		return new ClienteDTO(entity);
	}

	@Transactional
	public ClienteDTO update(Long id, ClienteDTO dto) {
		try {
			Cliente entity = repository.getOne(id);
			entity.setNome(dto.getNome());
			entity.setNascimento(dto.getNascimento());
			entity.setCpf(dto.getCpf());
			entity = repository.save(entity);

			return new ClienteDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new EntityNotFoundException("Usuário inexistente");
		}

	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new EntityNotFoundException("ID INEXISTENTE");
		} catch (DataIntegrityViolationException e) {
			throw new EntityNotFoundException("Violaçao de integridade");
		}

	}

}
