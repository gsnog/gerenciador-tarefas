package com.gerenciador_tarefas.model;

public class Tarefa {
    private String id;
    private String descricao;
    private String prioridade;
    private Boolean concluida;

    public Tarefa (String id, String descricao, String prioridade, Boolean concluida){
        this.id = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public String getId() {
        return id;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }
}
