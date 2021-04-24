package com.nexti.webgestao.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double totalCompra;
	private Instant dataCompra;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> items = new ArrayList<>();

//	@ManyToMany
//	@JoinTable(name = "tb_pedido_produto",
//	joinColumns = @JoinColumn(name = "id_pedido"),
//	inverseJoinColumns = @JoinColumn(name = "id_produto"))
//	private Set<Produto> produtos = new HashSet<>();

	public List<ItemPedido> getItems() {
		return items;
	}

	public Pedido() {

	}

	public Pedido(Long id, Double totalCompra, Instant dataCompra) {

		this.id = id;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
