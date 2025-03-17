package com.java10x.CadastroDePessoas.tarefas;

import com.java10x.CadastroDePessoas.UserModel;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "tb_tarefas")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tarefa;
    private int dificuldade;

    // uma tarefa pode ter mais de um dev
    @OneToMany(mappedBy = "tarefa")
    private UserModel users;



}
