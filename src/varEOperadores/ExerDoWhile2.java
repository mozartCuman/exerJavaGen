package varEOperadores;

import java.util.Scanner;

public class ExerDoWhile2 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia números inteiros via 
		 * teclado, até que o número zero seja digitado. Ao final, mostre 
		 * na tela a média de todos os números digitados, que sejam 
		 * múltiplos de 3.*/
		
		Scanner leia = new Scanner(System.in);
		
		
		int num, mult3 = 0, conta = 0;
		
		System.out.print(" Para saber a media dos possíveis múltiplos de três...");
		
		do {
			
			System.out.print("Digite: ");
			num = leia.nextInt();
			
			if (num % 3 == 0) {
				
				conta += 1;
				mult3 += num;
			}
			
		}while(num != 0);
		
		leia.close();
		
		System.out.println("A media dos números múltiplos de três é:" + mult3 / conta);
	}

}
