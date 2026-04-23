package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Lista2Exercicio3LacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0, menor21=0, maior50=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade>=0) {
			
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
	
		if(idade >= 0) {
		
			if(idade < 21) {
				
				menor21++;
		
			}
			else if(idade > 50){
				
				maior50++;
				
			}
			}
		}
		
	
System.out.println("Total de pessoas menores de 21 anos:" + menor21);
System.out.println("Total de pessoas maiores de 50 anos:" + maior50);
leia.close();

	}

}
