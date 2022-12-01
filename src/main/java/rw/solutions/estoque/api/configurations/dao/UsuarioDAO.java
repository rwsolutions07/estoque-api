package rw.solutions.estoque.api.configurations.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import rw.solutions.estoque.api.configurations.model.Perfil;
import rw.solutions.estoque.api.configurations.model.Usuario;

@Repository
public class UsuarioDAO {
	
	public Usuario getUsuarioPeloUsername(String username) {
		List<Perfil> perfis = new ArrayList<Perfil>();
		perfis.add(new Perfil(1L, "ADM"));
		
		return new Usuario(1L, "Willian", username, "$2a$10$mydl9jgx3.1qaCOOhV3g3e/yvgLcFhcJDArPlJ/O5AfX3hqeIts3C", perfis);

	}

}
