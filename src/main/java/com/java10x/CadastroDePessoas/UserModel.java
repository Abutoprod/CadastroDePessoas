package com.java10x.CadastroDePessoas;


import com.java10x.CadastroDePessoas.tarefas.TarefaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity ele transforma uma classe em uma entidade do DB
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
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


}
