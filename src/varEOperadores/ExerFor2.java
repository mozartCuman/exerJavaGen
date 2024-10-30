package varEOperadores;

import java.util.Scanner;

public class ExerFor2 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
		 * mostre na tela quantos números são pares e quantos número são ímpares. Veja 
		 * o exemplo abaixo:*/
		Scanner leia = new Scanner(System.in);
		
		int i, par = 0, imp = 0, joker;
		
		
		for(i = 0; i < 10; i++) {
			
			System.out.print("digite " + (i + 1) + "º numero:" );
			joker = leia.nextInt();
			if (joker % 2 == 0) {
				par += 1;
			} else {
				imp += 1;
			} 
		}
		
		leia.close();
		
		System.out.println("\n Foram: " + par + " números pares...");
		System.out.println(" Foram: " + imp + " números ímpares...");
	}

}
