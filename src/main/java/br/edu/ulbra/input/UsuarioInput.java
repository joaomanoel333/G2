package br.edu.ulbra.input;

public class UsuarioInput {

	private Long id;
	private String email;
	private PerfilInput perfil;
	private Boolean ativo; 
	private String nome;
	
	public UsuarioInput(){
		
	}
	
	public UsuarioInput(Long id, String email, PerfilInput perfil, Boolean ativo, String nome){
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

	public PerfilInput getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilInput perfil) {
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
