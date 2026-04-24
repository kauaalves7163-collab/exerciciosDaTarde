package vetorExercicios;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = {2,5,1,3,4,9,7,8,10,6};

		Scanner leia = new Scanner(System.in);

		int numero;
		boolean encontrado = false;

		System.out.print("Digite o número que deseja encontrar: ");
		numero = leia.nextInt();

		for(int i = 0; i < 10; i++) {

			if(vetor[i] == numero) {
				System.out.println("O número " + numero +
						" está localizado na posição: " + i);
				encontrado = true;
			}
		}

		if(!encontrado) {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

		leia.close();
		
	}

}
