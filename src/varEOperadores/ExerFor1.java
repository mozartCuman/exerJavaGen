package varEOperadores;

import java.util.Scanner;

public class ExerFor1 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
		 * onde o primeiro número deve ser menor do que o segundo número. Caso contrário, 
		 * deve ser exibida uma mensagem na tela informando que o intervalo é inválido e 
		 * sair do programa. No intervalo informado, mostre na tela todes os números que 
		 * são múltiplos de 3 e 5. Veja os exemplos abaixo: */
		
		Scanner leia = new Scanner(System.in);
		
		int i, nume1, nume2;
		
		
		System.out.println("Digite o primeiro numero: ");
		nume1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		nume2 = leia.nextInt();
		
		leia.close();
		
		if(nume1 > nume2) {
			System.out.println(" Intervalo invalido!!! Reinicie o programa...");
		} else {
			
			System.out.println("No intervalo de " + nume1 + " e " + nume2 );
			
			for( i = nume1; i < nume2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					
					System.out.println(i + " é múltiplo de 3 e 5");
					
				}
			}
		}
		


	}

}
