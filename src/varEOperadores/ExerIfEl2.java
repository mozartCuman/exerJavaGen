package varEOperadores;

import java.util.Scanner;

public class ExerIfEl2 {

	public static void main(String[] args) {
		/* Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre 
		 * na tela uma mensagem indicando se este número é par ou ímpar e se o número é 
		 * positivo ou negativo. Veja os exemplos abaixo:*/

		Scanner leia = new Scanner(System.in);
		
		int num1;
		
		System.out.print(" Digite um número para analise: par/ímpar, negativo/positivo: ");
		num1 = leia.nextInt();
		
		leia.close();
		
		if(num1 % 2 == 0) {
			System.out.print("\n O número:" + num1 + " é par, ");
		} else {
			System.out.print("\n O número:" + num1 + " é ímpar, ");
		}
		
		if(num1 > 0) {
			System.out.println("e é positivo...");
		} else if (num1 == 0) {
			System.out.println("e é nulo...");
		}else {
			System.out.println("e é negativo...");
		}
		
	}

}
