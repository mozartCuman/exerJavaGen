package iterablesMais;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;


public class ExerCollecSet {

	public static void main(String[] args) {
		/*Escreva um programa Java para criar uma Collection Set de Objetos
		 *  da Classe Wrapper Integer. O programa deverá solicitar ao usuário,
		 *   que ele digite via teclado 10 valores inteiros não repetidos e 
		 *   adicione-os individualmente na Collection Set. Em seguida, faça o 
		 *   que se pede:
			Mostre na tela todos os elementos da Collection Set, utilizando a
			 Classe Iterator.*/ 
		
		Set<Integer> sValores = new HashSet <Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Por gentileza digite 10 valores nao repetidos \n");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			sValores.add(leia.nextInt());
		}
		
		leia.close();
		
		Iterator<Integer> iValores = sValores.iterator();
		
		System.out.println("\n\n Elementos da colection: \n");
		
		while (iValores.hasNext()) {
			System.out.print(iValores.next() + " ");
		}
		

	}

}
