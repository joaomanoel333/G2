package br.edu.ulbra.entities;
import javax.persistence.*;

import br.edu.ulbra.entities.Perfil;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="email", nullable = false, length = 200)
	private String email;
	
	@Column(name="senha", nullable = false, length = 200)
	private String senha;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = false)
	private Perfil perfil;
	
	@Column(name="ativo",nullable = false)
	private Boolean ativo;
	
	@Column(name = "nome", nullable = false, length = 200)
	private String nome;
	
	public Usuario(){
		
	}
	
	public Usuario(Long id, String email, Perfil perfil, Boolean ativo, String nome){
		this.id = id;
		this.email = email;
		this.perfil = perfil;
		this.ativo = ativo;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
