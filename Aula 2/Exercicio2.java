import java.util.Scanner;
import java.util.Vector;

public class Exercicio2 {
    public static void main(String[] args) {
        String resposta = "";
        Scanner teclado = new Scanner(System.in);
        Vector<String> nomes = new Vector<>();

        while (!resposta.equalsIgnoreCase("F")) {
            System.out.println(
                    "Escolha uma opção: \nC para Cadastrar; \nS Selecionar todos os registros; \nR Realizar uma pesquisa através de um termo; \nA Alterar dados; \nRE Remoção; \nF Finalizar;");
            resposta = teclado.nextLine();

            switch (resposta) {
                case "C":
                    System.out.print("Digite o nome a ser cadastrado: ");
                    String nome = teclado.nextLine();

                    if (nomes.contains(nome)) {
                        System.out.println("Nome ja existe");
                    } else {
                        nomes.add(nome);
                        System.out.println("Nome registrado");
                    }

                    break;
                case "S":
                    System.out.println("Nomes cadastrados:");
                    for (String nomePercorrer : nomes) {
                        System.out.println(nomePercorrer);
                    }

                    break;
                case "R":
                    System.out.println("Digite o termo a ser buscado: ");
                    String termo = teclado.nextLine().toLowerCase();

                    System.out.println("Nomes com o termo pesquisado: ");
                    for (String nomeTermo : nomes) {
                        if (nomeTermo.toLowerCase().contains(termo)) {
                            System.out.println(nomeTermo);
                        }
                    }
                    break;
                case "A":
                    System.out.print("Digite o nome a alterar: ");
                    String nomeAlterar = teclado.nextLine();

                    for (int i = 0; i < nomes.size(); i++) {
                        String nomeAtual = nomes.get(i);
                        if (nomeAtual.equals(nomeAlterar)) {
                            System.out.print("Digite o novo nome: ");
                            String nomeAlterado = teclado.nextLine();

                            nomes.set(i, nomeAlterado);
                            System.out.println("Nome alterado");

                        }
                    }

                    break;
                case "RE":
                    System.out.print("Digite o nome a remover: ");
                    String nomeRemover = teclado.nextLine();

                    if (nomes.contains(nomeRemover)) {
                        nomes.remove(nomeRemover);
                        System.out.println("Nome removido");
                    } else {
                        System.out.println("Nome não encontrado");
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
