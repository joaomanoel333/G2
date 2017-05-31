package br.edu.ulbra.entities;

import javax.persistence.*;

@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "descricao", nullable = false, length = 200)
	private String descricao;
	
	public Perfil(){
		
	}
	
	public Perfil(Long id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
