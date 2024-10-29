package varEOperadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerSwitch2 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um algoritmo em Java que leia
		 *  o Nome do Colaborador (String), o Código do Cargo do 
		 *  Colaborador (número inteiro de 1 a 6) e o Salário (número 
		 *  float). A seguir, mostre na tela o Nome do Colaborador, o 
		 *  Cargo e o novo Salário reajustado.
		 *  
			Código |Cargo         |Percentual do Reajuste
			       |              |
			- 1    |Gerente       |10%
			- 2    |Vendedor      |7%
			- 3	   |Supervisor    |9%
			- 4    |Motorista     |6%
			- 5    |Estoquista    |5%
			- 6    |Tecnico de Ti |8%    
			*/

		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		String colab;
		int code;
		float dindin, ajuste, newdin;
		
		
		System.out.print(" Digite o nome do funcionário: ");
		colab = leitor.next();
		
		System.out.println("\nCódigo |Cargo      ");
		System.out.println("\n- 1    |Gerente      ");
		System.out.println("- 2    |Vendedor     ");
		System.out.println("- 3    |Supervisor   ");
		System.out.println("- 4    |Motorista    ");
		System.out.println("- 5    |Estoquista   ");
		System.out.println("- 6    |Tecnico de Ti");
		
		System.out.println("\n Digite o código do cargo: ");
		code = leitor.nextInt();
		
		System.out.println("Digite o salário: ");
		dindin = leitor.nextFloat();
		
		leitor.close();
		
		switch(code){
			case 1:
				ajuste = dindin / 10;
				newdin = ajuste + dindin;
				System.out.println("\nGerente: " + colab + ", teve 10% de ajuste, RS:" + ajuste);
				System.out.println("Novo total: " + df.format(newdin));	
			break;
			
			case 2:
				ajuste = (dindin / 100) * 7;
				newdin = ajuste + dindin;
				System.out.println("\nVendedor: " + colab + ", teve 7% de ajuste, RS:" + ajuste);
				System.out.println("Novo total: " + df.format(newdin));
			break;
			
			case 3:
				ajuste = (dindin / 100) * 9;
				newdin = ajuste + dindin;
				System.out.println("\nSupervisor: " + colab + ", teve 9% de ajuste, RS:" + ajuste);
				System.out.println("Novo total: " + df.format(newdin));
			break;
			
			case 4:
				ajuste = (dindin / 100) * 6;
				newdin = ajuste + dindin;
				System.out.println("\nMotorista: " + colab + ", teve 6% de ajuste, RS:" + ajuste);
				System.out.println("Novo total: " + df.format(newdin));	
			break;
			
			case 5:
				ajuste = (dindin / 100) * 5;
				newdin = ajuste + dindin;
				System.out.println("\nEstoquista: " + colab + ", teve 5% de ajuste, RS:" + ajuste);
				System.out.println("Novo total: " + df.format(newdin));
			break;
			
			case 6:
				ajuste = (dindin / 100) * 8;
				newdin = ajuste + dindin;
				System.out.println("\nTecnico de Ti: " + colab + ", teve 8% de ajuste, RS:" + ajuste);
				System.out.println("Novo total RS:" + df.format(newdin));
			break;
			
			default: 
				System.out.println("Digite uma opcão valida.: ");
			
		}
		
	}

}
