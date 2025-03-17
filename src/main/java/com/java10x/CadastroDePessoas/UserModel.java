package com.java10x.CadastroDePessoas;


import jakarta.persistence.*;

//Entity ele transforma uma classe em uma entidade do DB
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String Senha;
    public  UserModel(String nome,String cpf,String email,String Senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.Senha = Senha;
    }

    public String getCpf() {
        return cpf;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}
