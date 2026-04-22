package exerciciosLacosCondicionais;

import java.util.Scanner;

public class exercicio2LacosCondicionaisIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int numero;
		String parImpar, positivoNegativo;

		System.out.print("Digite um número: ");
		numero = leia.nextInt();

		// Verificação de Par ou Ímpar
		if (numero % 2 == 0) {
			parImpar = "par";
		} else {
			parImpar = "ímpar";
		}

		// Verificação de Positivo ou Negativo
		if (numero >= 0) {
			positivoNegativo = "positivo";
		} else {
			positivoNegativo = "negativo";
		}

		// Saída formatada
		System.out.println("\nO Número " + numero + " é " + parImpar + " e " + positivoNegativo + "!");

		leia.close();
		
	}

}
