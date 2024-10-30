package varEOperadores;

import java.util.Scanner;

public class ExerDoWhile {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado,
		 *  até que o número zero seja digitado. Ao final, mostre na tela a soma
		 *   de todos os números digitados, que sejam positivos. Veja o exemplo 
		 *   abaixo:*/
		
		Scanner leia = new Scanner(System.in);
		
		byte conte = 0;
		int soma = 0, cont = 0;
		
		System.out.println("Quantos números hão de ser inseridos??? :");
		conte = leia.nextByte();
		
		do {
			conte -= 1;
			
			System.out.print("Digite:");
			cont = leia.nextByte();
			
			if (cont > 0) {
				soma += cont;
			}
			
		
		}while( conte > 0);
		
		leia.close();
		
		System.out.println(" A soma de todos os numeros positivos foi:" + soma);
	}

}
