package com.projeto.oficina.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.projeto.oficina.entities.pk.OrdemServicos_Acoes_Pk;

@Entity
@Table(name = "ordemservicos_acoes")
public class OrdemServicos_Acoes {
	
	@EmbeddedId
	private OrdemServicos_Acoes_Pk id = new OrdemServicos_Acoes_Pk();
	
	@Column(name = "mensagem")
	private String mensagem;
	
	@Column(name = "data")
	private LocalDate data;

	public OrdemServicos_Acoes_Pk getId() {
		return id;
	}

	public void setId(OrdemServicos_Acoes_Pk id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	

}
