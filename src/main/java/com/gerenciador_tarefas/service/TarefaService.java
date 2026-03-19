package com.gerenciador_tarefas.service;

import com.gerenciador_tarefas.model.Tarefa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {
    private List<Tarefa> tarefas;

    public TarefaService (List<Tarefa> tarefa){
        this.tarefas = new ArrayList<>();
    }

    public Tarefa criarTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
        return tarefa;
    }

    public List<Tarefa> listarTarefas(){
        return this.tarefas;
    }

    public List<Tarefa> listarPorConcluida(){
        List<Tarefa> tarefasConcluidas = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas){
            if (tarefa.getConcluida() == true){
                tarefasConcluidas.add(tarefa);
            }
        } return tarefasConcluidas;
    }

    public Tarefa listarPorId(String id){
        for (Tarefa tarefa : this.tarefas){
            if (tarefa.getId().equals(id)){
                return tarefa;
            }
        } throw new IllegalArgumentException("Tarefa não encontrada!");
    }

    public Tarefa atualizarTarefa(String id, Tarefa tarefa){
        Tarefa tarefaAtualizada = listarPorId(id);
        tarefaAtualizada.setDescricao(tarefa.getDescricao());
        tarefaAtualizada.setPrioridade(tarefa.getPrioridade());
        tarefaAtualizada.setConcluida(tarefa.getConcluida());
        return tarefaAtualizada;
    }

    public Tarefa atualizarStatusTarefa (String id, Boolean concluida){
        Tarefa tarefaAtualizada = listarPorId(id);
        tarefaAtualizada.setConcluida(concluida);
        return tarefaAtualizada;
    }

    public void deletarTarefa(String id){
        Tarefa tarefaExcluida = listarPorId(id);
        this.tarefas.remove(tarefaExcluida);
    }
}
