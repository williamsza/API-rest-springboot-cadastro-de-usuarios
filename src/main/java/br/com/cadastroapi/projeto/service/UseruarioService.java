package br.com.cadastroapi.projeto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cadastroapi.projeto.Repository.IUsuario;
import br.com.cadastroapi.projeto.userModel.Usuario;

@Service
public class UseruarioService {
    private IUsuario repository;

    public UseruarioService(IUsuario reposytory) {
        this.repository = reposytory;

    }

    public List<Usuario> listarUsuarios() {
        List<Usuario> lista = repository.findAll();
        return lista;

    }

    public Usuario criaUsuario(Usuario usuario) {
        Usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;

    }

    public Usuario editaUsuario(Usuario usuario) {
        Usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;

    }

    public boolean excluirUsuario(Integer id) {
        repository.deleteById(id);
        return true;




}}
