package lista1CollectionsListExercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1CollectionsArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>();

		for(int i = 1; i <= 5; i++) {

			System.out.print("Digite uma cor: ");
			cores.add(leia.nextLine());

		}

		System.out.println("\nListar todas as cores:");

		for(String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		System.out.println("\nCores ordenadas:");

		for(String cor : cores) {
			System.out.println(cor);
		}

		leia.close();
		
	}

}
