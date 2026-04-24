package vetorExercicios;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int vetor[] = new int[10];

		int soma = 0;
		float media;

		for(int i = 0; i < 10; i++) {

			System.out.print("Digite o número: ");
			vetor[i] = leia.nextInt();

			soma += vetor[i];
		}

		System.out.println("\nElementos nos índices ímpares:");

		for(int i = 0; i < 10; i++) {

			if(i % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}

		System.out.println("\n\nElementos pares:");

		for(int i = 0; i < 10; i++) {

			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}

		media = (float) soma / 10;

		System.out.println("\n\nSoma: " + soma);
		System.out.println("Média: " + media);

		leia.close();
		
	}

}
