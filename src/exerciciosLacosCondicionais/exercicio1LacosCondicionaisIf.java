package exerciciosLacosCondicionais;

import java.util.Scanner;

public class exercicio1LacosCondicionaisIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int A, B, C, soma;

		System.out.print("Digite o número A: ");
		A = leia.nextInt();

		System.out.print("Digite o número B: ");
		B = leia.nextInt();

		System.out.print("Digite o número C: ");
		C = leia.nextInt();

		soma = A + B;


		if (soma > C) {
			System.out.println(A + " + " + B + " = " + soma + " > " + C);
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < C) {
			System.out.println(A + " + " + B + " = " + soma + " < " + C);
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println(A + " + " + B + " = " + soma + " = " + C);
			System.out.println("A Soma de A + B é Igual a C");
		}

		leia.close();
		}
	}


