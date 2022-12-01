package rw.solutions.estoque.api.configurations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import rw.solutions.estoque.api.configurations.dao.UsuarioDAO;

@Service
public class AutenticacaoService implements UserDetailsService {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return this.usuarioDAO.getUsuarioPeloUsername(username);
	}

}
