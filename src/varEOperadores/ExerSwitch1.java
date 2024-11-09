package varEOperadores;

import java.util.Scanner;

public class ExerSwitch1 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de 
		 * um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número 
		 * inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto
		 *  que foi comprado.
		 *  1
			Cachorro Quente
			R$ 10.00
			2
			X-Salada
			R$ 15.00
			3
			X-Bacon
			R$ 18.00
			4
			Bauru
			R$ 12.00
			5
			Refrigerante
			R$ 8.00
			6
			Suco de laranja
			R$ 13.00
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int code, qtd, mult;
		
		System.out.print(" Digite o codigo do produto [1-6]: ");
		code = leia.nextInt();
		
		System.out.print(" Digite o quantidade de produto: ");
		qtd = leia.nextInt();
		
		leia.close();
		
		switch(code) {
		case 1: 
			mult = qtd * 10;
			System.out.println("\n Produto: Cachorro Quente (und RS:10.00)");
			System.out.println("Valor total: RS:" + mult );
		break;
		
		case 2:
			mult = qtd * 15;
			System.out.println("\n Produto: X-Salada (und RS:15.00)");
			System.out.println("Valor total: RS:" + mult );
		break;
		
		case 3:
			mult = qtd * 18;
			System.out.println("\n Produto: X-Bacon (und RS:18.00)");
			System.out.println("Valor total: RS:" + mult );
		break;
		
		case 4:
			mult = qtd * 12;
			System.out.println("\n Produto: Bauru (und RS:12.00)");
			System.out.println("Valor total: RS:" + mult );
		break;
		
		case 5:
			mult = qtd * 8;
			System.out.println("\n Produto: Refrigerante (und RS:8.00)");
			System.out.println("Valor total: RS:" + mult );
		break;
		
		case 6:
			mult = qtd * 13;
			System.out.println("\n Produto: Suco de Laranja (und RS:13.00)");
			System.out.println("Valor total: RS:" + mult );
		break;
		
		default: System.out.println("Digite uma opcão valida.: ");
		}
		
		
		


	}

}
