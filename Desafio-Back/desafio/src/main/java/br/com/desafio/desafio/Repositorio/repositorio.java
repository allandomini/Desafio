package br.com.desafio.desafio.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.desafio.modelo.Prospect;

@Repository
public interface repositorio extends CrudRepository<Prospect,Long > {
    
}
