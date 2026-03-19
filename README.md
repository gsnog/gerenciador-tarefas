# ✅ API To-Do List Pro (Lógica de Estados)

Segundo desafio da trilha de estudos Spring Boot. Esta API foca na transição de estados de objetos (pendente/concluido) e filtragem de coleções em memória.

## 🛠️ Endpoints

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **POST** | `/tarefas` | Cria uma nova tarefa. |
| **GET** | `/tarefas` | Lista todas as tarefas. |
| **GET** | `/tarefas/concluidas` | Filtra e retorna apenas tarefas concluídas. |
| **PATCH** | `/tarefas/{id}` | Altera apenas o status de conclusão da tarefa. |
| **PUT** | `/tarefas/{id}` | Atualiza todos os campos da tarefa. |
| **DELETE** | `/tarefas/{id}` | Remove uma tarefa da lista. |

## 🧪 Exemplo de JSON (Tarefa)
```json
{
  "id": "1",
  "descricao": "Estudar Java na UFF",
  "prioridade": "ALTA",
  "concluida": false
}
