package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class lista1exercicio2LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num, pares = 0, impares = 0;
		Scanner leia = new Scanner(System.in);
	
		for(int i = 1; i <11; i++ ) {
	System.out.println("Digite o " + i +  "ºnúmero:");
	num = leia.nextInt();
	if(num % 2 ==0) {
	
		pares++;
		
	}
    else{
		
		impares++;
    	
	 }
   
	      }

		System.out.println();	
		System.out.println("Total de números pares:" + pares);	
		System.out.println("Total de números impares:" + impares);	
		leia.close();
			 
		
		}
	
	}


