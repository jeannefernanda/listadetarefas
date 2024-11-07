package com.byjeanne.listadetarefas.repository;

import com.byjeanne.listadetarefas.tarefas.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
