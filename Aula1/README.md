# Aula 1

a) O que é estrutura de dados?
Estrutura de dados é uma maneira de organizar, gerenciar e armazenar dados de modo a permitir o acesso eficiente e a manipulação eficaz desses dados.

b) Qual sua importância?
Importância em questão de otimizar o tempo de execução e o uso de memória para operações comuns, como inserção, busca, remoção e atualização de dados. 

c) Explique e exemplifique as estruturas: array (estático e dinâmico), lista, fila e pilha.

Array:
Um array é uma estrutura de dados que permite armazenar uma coleção de elementos do mesmo tipo sob um único nome.

Estático - É um array que se sabe o tamanho pré-definido e não ira mudar com métodos.

public class Exemplo {
int numero[] = new int[10];
}

______________________________________________________________________________________________________________________________________________________________________________________________________________________________

Dinâmico - É quando o array pode ser que aumente de tamanho, então ele é modificável por métodos.

public class Exemplo {
int[] numeros;

public Exemplo() {
this.numeros = new int[10];
}
}

______________________________________________________________________________________________________________________________________________________________________________________________________________________________

Lista:
Uma lista em Java é uma estrutura de dados que armazena elementos de forma ordenada e sequencial. Ao contrário dos arrays, as listas são dinâmicas, permitindo a adição e remoção de elementos sem a necessidade de definir um tamanho fixo.

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
   ArrayList<String> carros = new ArrayList<String>();
   carros.add("Fusca");
   carros.add("Brasília");
   carros.add("Chevette");
   carros.add("Monza");
   carros.add("Monza");
   System.out.println(carros);
   }
}

______________________________________________________________________________________________________________________________________________________________________________________________________________________________

Fila:
O padrão fila ou queue é uma estrutura de dados que segue o princípio "primeiro a entrar, primeiro a sair" (FIFO - First-In-First-Out).
Isso significa que o primeiro elemento inserido na fila será o primeiro a ser removido, esse é um dos padrões mais utilizados nos projetos.

Queue<String> fila = new LinkedList<>();

fila.add("Kagura Bachi");
fila.add("Sérgio Ramos");
fila.add("Cristiano Ronaldo");

System.out.println("Fila Inicial: " + fila);
String removido = fila.remove();
System.out.println("Elemento removido: " + removido);

System.out.println("Fila após remoção: " + fila);

______________________________________________________________________________________________________________________________________________________________________________________________________________________________

Pilha:
O padrão de pilha (Stack) em programação segue o princípio "último a entrar, primeiro a sair" (LIFO - Last-In-First-Out). Isso significa que o último elemento adicionado à pilha será o primeiro a ser removido. 
O padrão de pilha é comumente utilizado em programação para realizar operações como desfazer ações (undo), rastreamento de chamadas de função, análise de expressões matemáticas e muito mais.

Stack<String> pilha = new Stack<>();

pilha.push("Elemento 1");
pilha.push("Elemento 2");
pilha.push("Elemento 3");

System.out.println("Topo da pilha: " + pilha.peek());

while(!pilha.isEmpty()) {
String elementoRemovido = pilha.pop();
System.out.println("Elemento removido: " + elementoRemovido);
}

System.out.println("A pilha esta vazia?" + pilha.isEmpty();





