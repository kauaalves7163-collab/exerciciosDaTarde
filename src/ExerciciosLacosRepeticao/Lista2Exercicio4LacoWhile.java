package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Lista2Exercicio4LacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    
Scanner leia = new Scanner(System.in);
        
        int idade, genero, categoria;
        String continua = "S";
        
        int totalBackend = 0;
        int mulheresFrontend = 0; 
        int homensMobileMaiores40 = 0; 
        int naoBinariosFullStackMenores30 = 0;
        int totalRespostas = 0;
        int somaIdades = 0;

        while (continua.equalsIgnoreCase("S")) {
            System.out.print("Idade: ");
            idade = leia.nextInt();
            
            System.out.print("Identidade de Gênero (1-MC / 2-HC / 3-NB / 4-MT / 5-HT / 6-O): ");
            genero = leia.nextInt();
            
            System.out.print("Pessoa Desenvolvedora (1-Backend / 2-Frontend / 3-Mobile / 4-FullStack): ");
            categoria = leia.nextInt();

            
            totalRespostas++;
            somaIdades += idade;

            
            if (categoria == 1) {
                totalBackend++;
            }

            
            if ((genero == 1 || genero == 4) && categoria == 2) {
                mulheresFrontend++;
            }

            
            if ((genero == 2 || genero == 5) && categoria == 3 && idade > 40) {
                homensMobileMaiores40++;
            }

            
            if (genero == 3 && categoria == 4 && idade < 30) {
                naoBinariosFullStackMenores30++;
            }

            System.out.print("\nDeseja continuar a leitura (S/N)? ");
            continua = leia.next();
        }
        
        float mediaIdade = (float) somaIdades / totalRespostas;

        
        System.out.println("\n--- RESULTADOS DA PESQUISA ---");
        System.out.println("Total de pessoas Backend: " + totalBackend);
        System.out.println("Total de Mulheres Cis e Trans Frontend: " + mulheresFrontend);
        System.out.println("Total de Homens Cis e Trans Mobile maiores de 40 anos: " + homensMobileMaiores40);
        System.out.println("Total de Não Binários FullStack menores de 30 anos: " + naoBinariosFullStackMenores30);
        System.out.println("Número total de pessoas que responderam: " + totalRespostas);
        System.out.printf("Média de idade das pessoas: %.2f\n", mediaIdade);

        leia.close();
		
	}

}
