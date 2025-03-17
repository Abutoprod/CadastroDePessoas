package com.java10x.CadastroDePessoas.tarefas;

import com.java10x.CadastroDePessoas.UserModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefas")
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tarefa;
    private int dificuldade;

    // uma tarefa pode ter mais de um dev
    @OneToMany(mappedBy = "tarefa")
    private UserModel users;

    public TarefaModel(String tarefa, int dificuldade){
    this.tarefa = tarefa;
    this.dificuldade = dificuldade;
    }

}
