import java.util.LinkedList;
import java.util.Queue;

public class MetodosTarefas {
    private static Queue<Tarefa> tarefas;

    public MetodosTarefas() {
        tarefas = new LinkedList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void concluirRemover() {
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas esta vazia.");

        } else {
            Tarefa tarefa = tarefas.remove();
            System.out.println("A Tarefa que foi concluída: " + tarefa.getTarefa());
            System.out.println("Tarefa removida.");
        }
    }

    public void proximaTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas esta vazia.");
        } else {
            Tarefa proximaTarefa = tarefas.peek();
            System.out.println("A proxima tarefa a ser concluida é: " + proximaTarefa.getTarefa());
        }
    }
}
