package com.byjeanne.listadetarefas.controller;

import com.byjeanne.listadetarefas.tarefas.DadosCadastroTarefa;
import com.byjeanne.listadetarefas.tarefas.Tarefa;
import com.byjeanne.listadetarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroTarefa dados){
        repository.save(new Tarefa(dados));

    }




}
