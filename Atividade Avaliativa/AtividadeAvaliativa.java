import java.util.Scanner;

public class AtividadeAvaliativa {
    public static void main(String[] args) {
        String resposta = "";
        Scanner teclado = new Scanner(System.in);
        MetodosTarefas executarMetodo = new MetodosTarefas();

        while (!resposta.equalsIgnoreCase("F")) {
            System.out.println();
            System.out.println(
                    "Escolha uma opção: \nA Adicionar uma Tarefa; \nC Concluir uma Tarefa; \nV Visualizar a proxima Tarefa; \nF Finalizar;");
            resposta = teclado.nextLine();

            switch (resposta) {
                case "A":
                    System.out.println("Qual será a tarefa?: ");
                    String tarefa = teclado.nextLine();
                    executarMetodo.adicionarTarefa(new Tarefa(tarefa));
                    System.out.println("Tarefa adicionada.");

                    break;
                case "C":
                    executarMetodo.concluirRemover();

                    break;

                case "V":
                    executarMetodo.proximaTarefa();
                    break;

                case "F":
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }

}
