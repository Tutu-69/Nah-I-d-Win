
import java.util.Scanner;
import java.util.HashMap;

public class Exercicio5 {
    public static void main(String[] args) {
        String resposta = "";
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Pessoa> pessoas = new HashMap<>();

        while (!resposta.equalsIgnoreCase("F")) {
            System.out.println(
                    "Escolha uma opção: \nC para Cadastrar; \nS Selecionar todos os registros; \nA Alterar dados; \nE Exclusão; \n F Finalizar;");
            resposta = teclado.nextLine();

            switch (resposta) {
                case "C":
                    System.out.print("Digite o CPF: ");
                    String CPF = teclado.nextLine();
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = teclado.nextLine();
                    System.out.print("Digite a idade da pessoa: ");
                    int idade = teclado.nextInt();

                    if (pessoas.containsKey(CPF)) {
                        System.out.println("CPF ja existente");
                    } else {
                        Pessoa pessoa = new Pessoa(nome, idade, CPF);
                        pessoas.put(CPF, pessoa);
                        System.out.println("Pessoa Cadastrada");
                    }

                    break;
                case "S":
                    System.out.println("Pessoas Cadastradas: ");
                    for (Pessoa pessoaPercorrer : pessoas.values()) {
                        System.out.println("Nome: " + pessoaPercorrer.getNome() + ", Idade: "
                                + pessoaPercorrer.getIdade() + ", CPF: " + pessoaPercorrer.getCPF());
                    }

                    break;

                case "A":
                    System.out.print("Digite o CPF que as informações serão alteradas: ");
                    String CPFalterar = teclado.nextLine();

                    if (pessoas.containsKey(CPFalterar)) {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = teclado.nextLine();
                        System.out.print("Digite a nova idade: ");
                        int novaIdade = teclado.nextInt();

                        Pessoa pessoa = pessoas.get(CPFalterar);
                        pessoa.setNome(novoNome);
                        pessoa.setIdade(novaIdade);
                        System.out.println("Alteração Concluída.");
                    } else {
                        System.out.println("CPF não encontrado.");
                    }

                    break;
                case "E":
                    System.out.print("Digite o CPF do registro que deseja excluir: ");
                    String CPFexcluir = teclado.nextLine();

                    if (pessoas.containsKey(CPFexcluir)) {
                        pessoas.remove(CPFexcluir);
                        System.out.println("CPF removido.");
                    } else {
                        System.out.println("CPF não encontrado.");
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
