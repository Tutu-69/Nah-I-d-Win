import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Utilizei fila por fazer muito mais sentido, ja que os metodos integrados ja fazem tudo, eu nao precisaria criar metodos para interagir e efetuar oq eu quero
//se eu fosse usar array list teria q percorrer pela lista e achar posiçao tal, alem de gastar tempo pra criar o metodo
//pilha é o total contrario de fila na questao dos metodos
//e array eu teria que criar contador, e ainda for pra percorrer o array, seria muita mais linhas

public class Exercicio3 {
    public static void main(String[] args) {
        Queue<String> filaParaSerAtendido = new LinkedList<>();
        String resposta = "";
        Scanner teclado = new Scanner(System.in);

        while (!resposta.equalsIgnoreCase("F")) {
            System.out.println(
                    "Escolha uma opção: \nC para Cadastrar; \nR para remover; \nF para finalizar;");
            resposta = teclado.nextLine();

            switch (resposta) {
                case "C":
                    System.out.println("Informe o nome da pessoa para ser cadastrado na fila para atendimento: ");
                    String nome = teclado.nextLine();
                    filaParaSerAtendido.add(nome);
                    System.out.println("Pronto, Adicionado na fila.");

                    break;

                case "R":
                    if (!filaParaSerAtendido.isEmpty()) {
                        String atendimentoAtual = filaParaSerAtendido.remove();
                        System.out.println(atendimentoAtual + " foi atendido e removido da fila.");
                    }

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
