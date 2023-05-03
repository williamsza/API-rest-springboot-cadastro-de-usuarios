package br.com.cadastroapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastroapi.projeto.userModel.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer>{
    
}
