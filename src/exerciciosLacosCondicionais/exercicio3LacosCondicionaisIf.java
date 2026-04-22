package exerciciosLacosCondicionais;

import java.util.Scanner;

public class exercicio3LacosCondicionaisIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);
        
        String nome;
        int idade;
        boolean primeiraDoacao;
        boolean apto = false;

        // Entrada de Dados
        System.out.print("Digite o Nome do doador: ");
        nome = leia.nextLine();

        System.out.print("Digite a Idade do doador: ");
        idade = leia.nextInt();

        System.out.print("Primeira doação de sangue? (true/false): ");
        primeiraDoacao = leia.nextBoolean();

        // Lógica das Condicionais
        if (idade >= 18 && idade <= 69) {
            
            if (idade >= 60 && idade <= 69) {
                // Se estiver entre 60 e 69, só pode se NÃO for a primeira vez
                if (!primeiraDoacao) {
                    apto = true;
                } else {
                    apto = false;
                }
            } else {
                // Se tiver entre 18 e 59, está apto independente de ser a primeira vez
                apto = true;
            }
            
        } else {
            // Fora da faixa etária permitida
            apto = false;
        }

        // Saída de Dados
        if (apto) {
            System.out.println("\n" + nome + " está apta(o) para doar sangue!");
        } else {
            System.out.println("\n" + nome + " não está apta(o) para doar sangue!");
        }
        
        leia.close();
		
	}

}
