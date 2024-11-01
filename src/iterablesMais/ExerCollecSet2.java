package iterablesMais;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class ExerCollecSet2 {

	public static void main(String[] args) {
		/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper 
		 * Integer, inicializada com 10 valores inteiros. O programa deverá solicitar ao 
		 * usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no
		 *  Set, exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja 
		 *  encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!*/
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> sNumeros = new HashSet <>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		
		int receb;
		
		System.out.print(" Por gentileza digite seu número de pesquisa: ");
		receb = leia.nextInt();
		
		leia.close();
		
		if(sNumeros.contains(receb) == true) {
			System.out.println("\n O número " + receb + " foi encontrado!!! ");
		} else {
			System.out.println("\n O número " + receb + " não foi encontrado!!! ");
		}

	}

}
