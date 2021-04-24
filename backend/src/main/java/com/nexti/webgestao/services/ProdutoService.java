package com.nexti.webgestao.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexti.webgestao.dto.ProdutoDTO;
import com.nexti.webgestao.entities.Produto;
import com.nexti.webgestao.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	@Transactional(readOnly = true)
	public List<ProdutoDTO> findAll() {
		List<Produto> lista = repository.findAllByOrderByNomeAsc();
		return lista.stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
	}

	@Transactional
	public ProdutoDTO insert(ProdutoDTO dto) {
		Produto entity = new Produto();
		entity.setNome(dto.getNome());
		entity.setDescricao(dto.getDescricao());
		entity.setPreco(dto.getPreco());
		entity.setQuantidade(dto.getQuantidade());
		entity.setSku(dto.getSku());
		entity = repository.save(entity);
		return new ProdutoDTO(entity);
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

	@Transactional
	public ProdutoDTO update(Long id, ProdutoDTO dto) {
		try {
			Produto entity = repository.getOne(id);
			entity.setNome(dto.getNome());
			entity.setDescricao(dto.getDescricao());
			entity.setPreco(dto.getPreco());
			entity.setQuantidade(dto.getQuantidade());
			entity.setSku(dto.getSku());

			entity = repository.save(entity);

			return new ProdutoDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new EntityNotFoundException("Produto inexistente");
		}

	}

}
