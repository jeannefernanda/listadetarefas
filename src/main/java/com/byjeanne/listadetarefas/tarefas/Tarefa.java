package com.byjeanne.listadetarefas.tarefas;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tarefas")
@Entity(name = "tarefa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;

    public Tarefa(DadosCadastroTarefa dados){
        this.titulo = dados.titulo();;
        this.descricao = dados.descricao();
    }
}
