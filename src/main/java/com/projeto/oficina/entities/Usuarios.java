package com.projeto.oficina.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "chaverecuperarsenha")
	private String chaveRecuperarSenha;
	
	@Column(name = "chaveativaremail")
	private String chaveAtivarEmail;
	
	@Column(name = "chaverecuperarsenhavalida")
	private boolean chaveRecuperarSenhaValida;
	
	@Column(name = "emailativado")
	private boolean emailAtivado;
	
	@Column(name = "tipo")
	private String tipo;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getChaveRecuperarSenha() {
		return chaveRecuperarSenha;
	}

	public void setChaveRecuperarSenha(String chaveRecuperarSenha) {
		this.chaveRecuperarSenha = chaveRecuperarSenha;
	}

	public String getChaveAtivarEmail() {
		return chaveAtivarEmail;
	}

	public void setChaveAtivarEmail(String chaveAtivarEmail) {
		this.chaveAtivarEmail = chaveAtivarEmail;
	}

	public boolean isChaveRecuperarSenhaValida() {
		return chaveRecuperarSenhaValida;
	}

	public void setChaveRecuperarSenhaValida(boolean chaveRecuperarSenhaValida) {
		this.chaveRecuperarSenhaValida = chaveRecuperarSenhaValida;
	}

	public boolean isEmailAtivado() {
		return emailAtivado;
	}

	public void setEmailAtivado(boolean emailAtivado) {
		this.emailAtivado = emailAtivado;
	}
	
	
	
	
}
