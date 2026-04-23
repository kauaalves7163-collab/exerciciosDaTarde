package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class lista1exercicio1RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1, numero2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		numero2 = leia.nextInt();
		
		if(numero1 >= numero2) {
		
			System.out.println("Intervalo inválido!");
			
		}
		
		for(int i = numero1; i<=numero2; i++) {
			
		if (i % 3 == 0 && i % 5 ==0) {
			
			System.out.println(i + " é múltiplo de 3 e 5");
					
		}
		
		}
		
		leia.close();
		
		}
	}


