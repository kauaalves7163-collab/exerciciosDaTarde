package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Lista3Exercicio6LacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, soma=0, contador=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num !=0 && num % 3 ==0) {
			
				soma += num;
				contador++;
			
			}
			
		
		}	while(num != 0);
		
		if(contador >0) {
		
		media =  (float) soma / contador;
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		
		}	
		leia.close();
	}
}


