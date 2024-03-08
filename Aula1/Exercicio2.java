import java.util.ArrayList;
import java.util.Scanner;

// o Exercicio n tem tantas informaçoes ent criei uma nova variavel termo pra facilitar, e tbm coloquei todas as interaçoes e funcionalidades dentro do main
//daria pra utilizar metodos, mas seria mais chato
public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        String resposta = "";
        Scanner teclado = new Scanner(System.in);

        while (!resposta.equalsIgnoreCase("F")) {
            System.out.println(
                    "Escolha uma opção: \nC para Cadastrar; \nL para listar todos os produtos; \nP para pesquisar \nA para alterar; \nR para remover; \nF para finalizar;");
            resposta = teclado.nextLine();

            switch (resposta) {
                case "C":
                    System.out.println("Nome do produto:");
                    String nome = teclado.nextLine();

                    System.out.println("Valor do produto:");
                    double valor = teclado.nextDouble();

                    System.out.println("Termo do produto:");
                    String termo = teclado.nextLine();

                    Produto produto = new Produto(nome, valor, termo);
                    produtos.add(produto);
                    System.out.println("Produto cadastrado");
                    break;

                case "L":
                    System.out.println("Lista de produtos:");
                    for (Produto p : produtos) {
                        System.out.println(
                                "Nome: " + p.getNome() + "\n Valor: " + p.getValor() + "\n Termo: " + p.getTermo());
                    }

                    break;
                case "P":
                    System.out.println("Termo a pesquisar:");
                    String termoPesquisar = teclado.nextLine();

                    for (Produto p : produtos) {
                        if (p.getTermo().equalsIgnoreCase(termoPesquisar)) {
                            System.out.println("Nome: " + p.getNome() + "\n Valor: " + p.getValor());

                        }
                    }

                    break;
                case "A":
                    System.out.println("Nome do produto a ser alterado: ");
                    String nomeProdutoAlterar = teclado.nextLine();

                    for (Produto p : produtos) {
                        if (p.getNome().equals(nomeProdutoAlterar)) {
                            System.out.println("Novo nome do produto: ");
                            String novoNome = teclado.nextLine();

                            System.out.println("Novo valor do produto: ");
                            double novoValor = teclado.nextDouble();

                            System.out.println("Novo termo do produto: ");
                            String novoTermo = teclado.nextLine();

                            p.setNome(novoNome);
                            p.setValor(novoValor);
                            p.setTermo(novoTermo);
                            System.out.println("Produto alterado");

                        }
                    }

                    break;
                case "R":
                    System.out.println("Nome do produto a remover: ");
                    String nomeProdutoRemover = teclado.nextLine();

                    for (int i = 0; i < produtos.size(); i++) {
                        Produto p = produtos.get(i);
                        if (p.getNome().equalsIgnoreCase(nomeProdutoRemover)) {
                            produtos.remove(i);
                            System.out.println("Produto removido");

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
