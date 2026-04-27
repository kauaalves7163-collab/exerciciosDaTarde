package exercicioPilhaFilaCollections;



import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exemplo2Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> pilha = new ArrayDeque<String>();
        Scanner leia = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("*****************************************************");
            System.out.println("            1 - Adicionar Livro na Pilha");
            System.out.println("            2 - Listar todos os Livros");
            System.out.println("            3 - Retirar Livro da Pilha");
            System.out.println("            0 - Sair");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");
            
            opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeLivro = leia.nextLine();
                    
                    pilha.push(nomeLivro); 
                    
                    System.out.println("\nPilha:");
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                    System.out.println("Livro adicionado!\n");
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!\n");
                    } else {
                        System.out.println("\nLista de Livros na Pilha:");
                        for (String livro : pilha) {
                            System.out.println(livro);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!\n");
                    } else {
                        
                        pilha.pop(); 
                        
                        System.out.println("\nPilha:");
                        for (String livro : pilha) {
                            System.out.println(livro);
                        }
                        System.out.println("Um Livro foi retirado da pilha!\n");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }
		
	}

}
