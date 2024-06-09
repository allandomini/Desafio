package br.com.desafio.desafio.Controle;

import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.desafio.Repositorio.repositorio;
import br.com.desafio.desafio.modelo.Prospect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@CrossOrigin(origins = "*")
public class controle {
 
    @Autowired
    private repositorio acao;

    @PostMapping("/")
    public Prospect cadastrar(@RequestBody Prospect p ){
        return acao.save(p);
    }

    @GetMapping("/")
    public Iterable<Prospect> selecionar() {
        return acao.findAll();
    }
    @PutMapping("/")
    public Prospect editar(@RequestBody Prospect p){
        return acao.save(p);
    }
    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable long codigo){
        acao.deleteById(codigo);
    }

    
}
