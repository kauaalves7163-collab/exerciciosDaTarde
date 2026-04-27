package exercicioPilhaFilaCollections;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<String> fila = new LinkedList<String>();
        Scanner leia = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("*****************************************************");
            System.out.println("            1 - Adicionar Cliente na Fila");
            System.out.println("            2 - Listar todos os Clientes");
            System.out.println("            3 - Retirar Cliente da Fila");
            System.out.println("            0 - Sair");
            System.out.println("*****************************************************");
            System.out.print("Digite uma opção: ");
            
            opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = leia.nextLine();
                    fila.add(nome); 
                    
                    System.out.println("\nFila:");
                    
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                    System.out.println("Cliente Adicionado!\n");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia!\n");
                    } else {
                        System.out.println("\nLista de Clientes na Fila:");
                        
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia!\n");
                    } else {
                        fila.poll(); 
                        
                        System.out.println("\nFila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                        System.out.println("O Cliente foi Chamado!\n");
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
        leia.close();
		}
		
	}


