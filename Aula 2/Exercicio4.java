
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String resposta = "";
        Scanner teclado = new Scanner(System.in);
        List<String> nomes = new LinkedList<>();

        while (!resposta.equalsIgnoreCase("F")) {
            System.out.println(
                    "Escolha uma opção: \nC para Cadastrar; \nL Listar; \nF Finalizar;");
            resposta = teclado.nextLine();

            switch (resposta) {
                case "C":
                    System.out.print("Digite o nome a ser cadastrado na lista: ");
                    String nome = teclado.next();
                    nomes.add(nome);
                    System.out.println("Nome cadastrado na lista.");

                    break;
                case "L":
                System.out.println("Nomes cadastrados na lista: ");
                    for (String nomePercorrer : nomes) {
                        System.out.println(nomePercorrer);
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
