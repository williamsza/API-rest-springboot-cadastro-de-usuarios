package br.com.cadastroapi.projeto.userModel;

import org.assertj.core.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name="id")
    private Integer id;
    @Column( name="nome", length = 200, nullable = true)
    private String nome;
    @Column( name="email", length = 50, nullable = true)
    private String email;
    @Column( name="senha", columnDefinition = "TEXT", nullable = true)
    private String senha;

    @Column( name="telefone", length = 15, nullable = true)
    private String telefone;

    public Usuario(Integer id, String nome, String email, String senha, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
