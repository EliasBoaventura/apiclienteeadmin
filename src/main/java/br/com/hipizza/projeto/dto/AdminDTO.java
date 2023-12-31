package br.com.hipizza.projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.hipizza.projeto.entity.AdminEntity;

public class AdminDTO {
	
	private Long id;
	private String nome;
	private String login;
	private String senha;
	private String email;
	
	public AdminDTO(AdminEntity admin) {
		BeanUtils.copyProperties(admin, this);
	}
	
	public AdminDTO() {
		
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
