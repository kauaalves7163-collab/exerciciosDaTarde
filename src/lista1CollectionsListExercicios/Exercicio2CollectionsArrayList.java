package lista1CollectionsListExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2CollectionsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.print("Digite o número que deseja encontrar: ");
		int numero = leia.nextInt();

		if(numeros.contains(numero)) {

			System.out.println("O número "
					+ numero +
					" está localizado na posição: "
					+ numeros.indexOf(numero));

		}
		else {

			System.out.println("O número "
					+ numero +
					" não foi encontrado!");

		}

		leia.close();
		
	}

}
