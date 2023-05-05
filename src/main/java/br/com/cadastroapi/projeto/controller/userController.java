package br.com.cadastroapi.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastroapi.projeto.Repository.IUsuario;
import br.com.cadastroapi.projeto.service.UseruarioService;
import br.com.cadastroapi.projeto.userModel.Usuario;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class userController {

    @Autowired

    private UseruarioService usuarioService;

    public userController(UseruarioService usuarioService) {
        this.usuarioService = usuarioService;

    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listaUsuarios() {
        // List<Usuario> lista = usuarioService.listarUsuarios();
        return ResponseEntity.status(200).body(usuarioService.listarUsuarios());

    }

    @PostMapping
    public ResponseEntity<Usuario> criaUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.status(201).body(usuarioService.criaUsuario(usuario));
    }

    @PutMapping
    public ResponseEntity<Usuario> editaUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.status(200).body(usuarioService.editaUsuario(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirUsuario(@PathVariable Integer id) {
        usuarioService.excluirUsuario(id);
        return ResponseEntity.status(204).build();
    }

}
