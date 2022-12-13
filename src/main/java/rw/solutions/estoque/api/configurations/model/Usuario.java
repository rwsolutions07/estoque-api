package rw.solutions.estoque.api.configurations.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Usuario implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5753141167111483857L;
	

	private Long id;
	private String nome;
	private String usuarioUsername;
	private String usuarioPassword;
	private List<Perfil> perfis = new ArrayList<Perfil>();
	
	
	public Usuario(Long id, String nome, String usuarioUsername, String usuarioPassword, List<Perfil> perfis) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuarioUsername = usuarioUsername;
		this.usuarioPassword = usuarioPassword;
		this.perfis = perfis;
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
	public String getUsuarioUsername() {
		return usuarioUsername;
	}
	public void setUsuarioUsername(String usuarioUsername) {
		this.usuarioUsername = usuarioUsername;
	}
	public String getUsuarioPassword() {
		return usuarioPassword;
	}
	public void setUsuarioPassword(String usuarioPassword) {
		this.usuarioPassword = usuarioPassword;
	}
	
	public List<Perfil> getPerfis() {
		return perfis;
	}
	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nome, usuarioPassword, usuarioUsername);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(usuarioPassword, other.usuarioPassword)
				&& Objects.equals(usuarioUsername, other.usuarioUsername);
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.perfis;
	}
	@Override
	public String getPassword() {
		return this.usuarioPassword;
	}
	@Override
	public String getUsername() {
		return this.usuarioUsername;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
	
	
	

}
