package exerciciosLacosCondicionais;

import java.util.Scanner;

public class exercicio6LacosCondicionaisSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);
        
        String nome, cargo = "";
        int codigoCargo;
        float salario, novoSalario, percentual = 0;

        // Entrada de Dados
        System.out.print("Nome do colaborador: ");
        nome = leia.nextLine();

        System.out.print("Cargo: ");
        codigoCargo = leia.nextInt();

        System.out.print("Salário: R$ ");
        salario = leia.nextFloat();

        // Estrutura de Decisão para definir Cargo e Percentual
        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                percentual = 0.10f; // 10%
                break;
            case 2:
                cargo = "Vendedor";
                percentual = 0.07f; // 7%
                break;
            case 3:
                cargo = "Supervisor";
                percentual = 0.09f; // 9%
                break;
            case 4:
                cargo = "Motorista";
                percentual = 0.06f; // 6%
                break;
            case 5:
                cargo = "Estoquista";
                percentual = 0.05f; // 5%
                break;
            case 6:
                cargo = "Técnico de TI";
                percentual = 0.08f; // 8%
                break;
            default:
                System.out.println("Código de cargo inválido!");
                leia.close();
                return;
        }

        // Cálculo do Novo Salário: Salário + (Reajuste * Salário)
        novoSalario = salario + (percentual * salario);

        // Saída de Dados
        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f\n", novoSalario);

        leia.close();
		
	}

}
