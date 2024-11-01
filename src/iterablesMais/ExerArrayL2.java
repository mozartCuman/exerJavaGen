package iterablesMais;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ExerArrayL2 {

	public static void main(String[] args) {
		/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper
		 *  Integer, inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que 
		 *  ele digite via teclado 1 número inteiro e caso ele seja encontrado no ArrayList, exiba 
		 *  na tela a posição deste número na Collection. Caso o número não seja encontrado, ele 
		 *  deverá exibir na tela a mensagem: O número NN não foi encontrado!*/ 
		
		Scanner leia = new Scanner(System.in);
		ArrayList <Integer> numeros = new ArrayList<>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		int passador;
		
		System.out.print("Digite o numero que deseja achar: ");
		passador = leia.nextInt();
		
		leia.close();
		
		if(numeros.contains(passador) == true) {
			System.out.println("\n O número " + passador + " está no index:" + numeros.indexOf(passador));
		} else {
			System.out.println("\n O número " + passador + " não foi encontrado.");
		}
		 

	}

}
