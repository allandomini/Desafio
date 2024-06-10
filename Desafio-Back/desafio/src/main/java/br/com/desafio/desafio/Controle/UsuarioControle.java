package br.com.desafio.desafio.Controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.desafio.desafio.Repositorio.UsuarioRepositorio;
import br.com.desafio.desafio.modelo.Usuario;
import br.com.desafio.desafio.Service.UserService;

@RestController
public class UsuarioControle {

    @Autowired
    private UsuarioRepositorio acao;

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/usuario")
    public Usuario cadastrar(@RequestBody Usuario p) {
        return acao.save(p);
    }

    @GetMapping("/usuario")
    public Iterable<Usuario> selecionar() {
        return acao.findAll();
    }

    @PutMapping("/usuario")
    public Usuario editar(@RequestBody Usuario p) {
        return acao.save(p);
    }

    @DeleteMapping("/usuario/{codigo}")
    public void remover(@PathVariable long codigo) {
        acao.deleteById(codigo);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario usuario) {
        Usuario usuarioExistente = userService.findByName(usuario.getName());
        if (usuarioExistente != null && usuarioExistente.getSenha().equals(usuario.getSenha())) {
            return ResponseEntity.ok(usuarioExistente);
        } else {
            return ResponseEntity.status(401).body("Usuário ou senha inválidos");
        }
    }
}
