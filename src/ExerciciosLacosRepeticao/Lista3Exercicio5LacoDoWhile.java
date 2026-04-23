package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Lista3Exercicio5LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, positivo=0;
		Scanner leia = new Scanner(System.in);
		
		do {
		 
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if(num > 0) {
		positivo += num;
				
		}
		
		
		}	 while(num !=0);
		
		System.out.println("A soma dos números positivos é: " + positivo);
		leia.close();
	}

}
