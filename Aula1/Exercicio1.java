import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        String[] nomes = new String[10];
        String resposta = "";
        Scanner teclado = new Scanner(System.in);

        while (!resposta.equalsIgnoreCase("F")) {
            System.out.println(
                    "Escolha uma opção: \nC para Cadastrar; \nL para listar todos os nomes; \nA para alterar; \nR para remover; \nF para finalizar;");
            resposta = teclado.nextLine();

            switch (resposta) {
                case "C":
                    System.out.println("Digite o nome a ser cadastrado: ");
                    String nome = teclado.nextLine();
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] == null) {
                            nomes[i] = nome;
                            System.out.println("Nome cadastrado.");
                        }
                    }

                    break;
                case "L":
                    System.out.println("Nomes no Array: ");
                    for (String names : nomes) {
                        if (names != null) {
                            System.out.println(names);
                        }
                    }

                    break;
                case "A":
                    System.out.println("Digite o nome a alterar: ");
                    String nomeAntigo = teclado.nextLine();
                    System.out.println("Digite o novo nome: ");
                    String novoNome = teclado.nextLine();

                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i].equals(nomeAntigo)) {
                            nomes[i] = novoNome;
                            System.out.println("Nome alterado com sucesso!");
                        }
                    }
                    break;
                case "R":
                    System.out.println("Digite o nome que deseja remover:");
                    String nomeRemover = teclado.nextLine();

                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i].equals(nomeRemover)) {
                            nomes[i] = null;
                            System.out.println("Nome removido com sucesso!");
                            break;
                        }
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
