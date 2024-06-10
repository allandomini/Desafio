package br.com.desafio.desafio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.desafio.Repositorio.UsuarioRepositorio;
import br.com.desafio.desafio.modelo.Usuario;

@Service
public class UserService {
    @Autowired
    private UsuarioRepositorio userRepository;

    public Usuario findByName(String username) {
        return userRepository.findByName(username);
    }
}
