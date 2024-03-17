import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        String resposta = "";
        Scanner teclado = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (!resposta.equalsIgnoreCase("F")) {
            System.out.println(
                    "Escolha uma opção: \nC para Cadastrar; \nS Selecionar todos os registros; \nQ Quantidade de segmentos; \nA Alterar dados; \nR Remoção; \n F Finalizar;");
            resposta = teclado.nextLine();

            switch (resposta) {
                case "C":
                    System.out.print("Digite o nome do produto: ");
                    String nomeDoProduto = teclado.nextLine();
                    System.out.print("Digite o segmento do produto: ");
                    String segmento = teclado.nextLine();

                    Produto produto = new Produto(nomeDoProduto, segmento);
                    produtos.add(produto);
                    System.out.println("Produto cadastrado.");

                    break;
                case "S":
                    System.out.println("Produtos cadastrados:");
                    for (Produto todosOsProdutos : produtos) {
                        System.out.println("Nome do Produto: " + todosOsProdutos.getNome() + "\n Segmento do Produto: "
                                + todosOsProdutos.getSegmento());
                    }

                    break;
                case "Q":
                    System.out.println("Quantidade de produtos por segmento:");
                    ArrayList<String> segmentos = new ArrayList<>();
                    for (Produto produtoSegmento : produtos) {
                        if (!segmentos.contains(produtoSegmento.getSegmento())) {
                            segmentos.add(produtoSegmento.getSegmento());
                        }
                    }
                    for (String segmentoPercorrer : segmentos) {
                        int contador = 0;
                        for (Produto produtoPercorrer : produtos) {
                            if (produtoPercorrer.getSegmento().equals(segmentoPercorrer)) {
                                contador++;
                            }
                        }
                        System.out.println(segmentoPercorrer + ": " + contador);
                    }

                    break;
                case "A":
                    System.out.print("Digite o nome do produto a alterar: ");
                    String nomeProdutoAlterar = teclado.nextLine();

                    for (Produto produtoAlterar : produtos) {
                        if (produtoAlterar.getNome().equals(nomeProdutoAlterar)) {
                            System.out.print("Digite o novo nome do produto: ");
                            String nomeAlterado = teclado.nextLine();
                            System.out.print("Digite o novo segmento do produto: ");
                            String segmentoAlterado = teclado.nextLine();

                            produtoAlterar.setNome(nomeAlterado);
                            produtoAlterar.setSegmento(segmentoAlterado);
                            System.out.println("Produto alterado");

                        }
                    }

                    break;
                case "R":
                    System.out.print("Digite o nome do produto a remover: ");
                    String nomeProdutoRemover = teclado.nextLine();

                    for (Produto produtoRemover : produtos) {
                        if (produtoRemover.getNome().equals(nomeProdutoRemover)) {
                            produtos.remove(produtoRemover);
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
