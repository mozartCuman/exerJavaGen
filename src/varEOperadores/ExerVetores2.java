package varEOperadores;

import java.util.Scanner;

public class ExerVetores2 {

	public static void main(String[] args) {
		/*Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor.
		 *  Em seguida, mostre na tela:
			Todos os elementos dos índices ímpares do vetor 
			Todos os elementos do vetor que são números pares
			A Soma de todos os elementos do vetor
			A Média de todos os elementos do vetor, armazenada em uma variável do tipo real*/ 
		
		Scanner leia = new Scanner(System.in);
		
		int vivito[] = new  int[10], papar[] = new  int[10], impar[] = new  int[10], somador = 0, passador;
		float media;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print(" Digite o " + (i + 1) + "º valor: ");
			passador = leia.nextInt();
			
			vivito[i] = passador;
			somador += passador;
			
			if(i % 2 > 0) {
				impar[i] = passador;
			}
			
			if(passador % 2 == 0) {
				papar[i] = passador;
			}
			
		}
		
		leia.close();
		
		media = somador / 10;
		
		System.out.println("\n Todos os elementos dos indices ímpares \n ");
		
		for(int i = 0; i < 10; i++) {
			if(impar[i] > 0) {
				System.out.print(impar[i] + " ");
			}
		}
			
		System.out.println("\n Todos os elementos pares do vetor \n ");
			
		for(int i = 0; i < 10; i++) {
			if(papar[i] > 0) {
				System.out.print(papar[i] + " ");
			}	
		}
		
		System.out.println("\n A soma de todos os elementos do vetor:" + somador);
		System.out.println(" A média de todos os elementos do vetor:" + media);
		
	}

}
