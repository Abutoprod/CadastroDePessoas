package com.java10x.CadastroDePessoas;


import com.java10x.CadastroDePessoas.tarefas.TarefaModel;
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


    @ManyToOne// uma unica tarefa para usuario
    @JoinColumn(name = "id_tarefa") // criar chave estrangeira
    private TarefaModel tarefas;

    public  UserModel(String nome,String cpf,String email,String Senha) {


        this.nome = nome;
        this.cpf = cpf;
        this.email = email;


    }
    UserModel(TarefaModel tarefas){
        this.tarefas = tarefas;
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


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
