package varEOperadores;

import java.util.Scanner;

public class ExerSwitch3 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um algoritmo em Java, que
		 *  simule uma Calculadora simples. O programa deverá ler dois 
		 *  números float: numero1 e numero2, e na sequência ler o Código
		 *   da operação matemática (número inteiro de 1 a 4). A seguir, 
		 *   mostre na tela o resultado da operação entre os 2 números. 
		 *   Caso a operação seja diferente do intervalo 1 a 4, mostre a 
		 *   mensagem Operação Inválida!
*/
		Scanner leia = new Scanner(System.in);
		
		float total, numero, numero2;
		int escolha;
		
		
		System.out.print("Primeiro número:");
		numero = leia.nextFloat();
		System.out.print("Segundo número:");
		numero2 = leia.nextFloat();
		
		System.out.println("Selecione operação: ");
		System.out.println("\n- 1 | Soma");
		System.out.println("- 2 | Subtração");
		System.out.println("- 3 | Multplicação");
		System.out.println("- 4 | Divisão");
		System.out.print("Digite sua escolha: ");
		escolha = leia.nextInt();
		
		leia.close();
		
		switch(escolha) {
		case 1:
			total = numero + numero2;
			System.out.println("\n A soma: " + numero + " + " + numero2 + " = " + total);
		break;
		
		case 2:
			total = numero - numero2;
			System.out.println("\n A subtração: " + numero + " - " + numero2 + " = " + total);
		break;
		
		case 3:
			total = numero * numero2;
			System.out.println("\n A multiplicação: " + numero + " * " + numero2 + " = " + total);
		break;
		
		case 4:
			total = numero / numero2;
			System.out.println("\n A divisão de: " + numero + " / " + numero2 + " = " + total);
		break;
		
		default: 
			System.out.println("Digite uma opcão valida.: ");
		 
		}
	}

}
