package br.com.cadastroapi.projeto.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastroapi.projeto.DAO.IUsuario;
import br.com.cadastroapi.projeto.userModel.Usuario;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class userController {


    @Autowired
    private IUsuario dao;

    
    @GetMapping
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) dao.findAll();
        
    }
    
    @PostMapping
    public Usuario criaUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = dao.save(usuario);
        return novoUsuario;
    }
    
}



