package br.com.desafio.desafio.Repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.desafio.desafio.modelo.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {
    Usuario findByName(String name);
}
