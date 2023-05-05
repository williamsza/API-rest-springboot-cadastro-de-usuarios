package br.com.cadastroapi.projeto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastroapi.projeto.userModel.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer>{
    
}
