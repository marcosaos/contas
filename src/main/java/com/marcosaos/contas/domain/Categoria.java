package com.marcosaos.contas.domain;

import java.io.Serializable;

public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Integer idPai;
	private String status;
	private Integer pOrcamento;
	
	public Categoria() {}

	public Categoria(Integer id, String nome, Integer idPai, String status, Integer pOrcamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.idPai = idPai;
		this.status = status;
		this.pOrcamento = pOrcamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdPai() {
		return idPai;
	}

	public void setIdPai(Integer idPai) {
		this.idPai = idPai;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getpOrcamento() {
		return pOrcamento;
	}

	public void setpOrcamento(Integer pOrcamento) {
		this.pOrcamento = pOrcamento;
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
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
