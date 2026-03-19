package com.gerenciador_tarefas.controller;

import com.gerenciador_tarefas.model.Tarefa;
import com.gerenciador_tarefas.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public ResponseEntity<Tarefa> cadastrarTarefa(@RequestBody Tarefa tarefa){
        tarefaService.criarTarefa(tarefa);
        return ResponseEntity.status(HttpStatus.CREATED).body(tarefa);
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> listarTodasTarefas(){
        List<Tarefa> tarefas = tarefaService.listarTarefas();
        return ResponseEntity.status(HttpStatus.OK).body(tarefas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> listarPorId(@PathVariable String id){
        Tarefa tarefaEncontrada = tarefaService.listarPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(tarefaEncontrada);
    }

    @GetMapping("/concluidas")
    public ResponseEntity<List<Tarefa>> listarPorStatus(){
        List<Tarefa> tarefasConcluidas = tarefaService.listarPorConcluida();
        return ResponseEntity.status(HttpStatus.OK).body(tarefasConcluidas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable String id, @RequestBody Tarefa tarefa){
        Tarefa tarefaAtualizada = tarefaService.atualizarTarefa(id, tarefa);
        return ResponseEntity.status(HttpStatus.OK).body(tarefaAtualizada);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarStatusTarefa(@PathVariable String id, @RequestBody Boolean concluida){
        Tarefa tarefaAtualizada = tarefaService.atualizarStatusTarefa(id, concluida);
        return ResponseEntity.status(HttpStatus.OK).body(tarefaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable String id){
        tarefaService.deletarTarefa(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
