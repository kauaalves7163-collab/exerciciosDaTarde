package lista2CollectionSetExercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1CollectionsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		for(int i=1; i<=10; i++) {

			System.out.print("Digite um número: ");
			numeros.add(leia.nextInt());

		}

		System.out.println("\nListar dados do Set:");

		Iterator<Integer> iterator = numeros.iterator();

		while(iterator.hasNext()) {

			System.out.println(iterator.next());

		}

		leia.close();

		
	}

}
