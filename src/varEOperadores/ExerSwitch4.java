package varEOperadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerSwitch4 {

	public static void main(String[] args) {
		/*Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler
		 *  o tipo de operação a ser realizada com base na tabela abaixo (número inteiro
		 *   entre 1 e 3) e o valor a ser depositado ou sacado (somente nas opções 2 e 3).
		 *    Considere que um saque só pode ser realizado caso haja saldo suficiente. Ao
		 *     final de cada operação, exiba o novo Saldo na tela. A variável saldo 
		 *     (float), será inicializada com o valor de R$ 1000.00. Caso a operação seja
		 *      diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!
*/ 
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		int option;
		float depo, conta = 1000, val, joker;
		
		System.out.println("* 1  | Saldo");
		System.out.println("* 2  | Saque");
		System.out.println("* 3  | Deposito");
		
		System.out.print("\n Selecione: ");
		option = leia.nextInt();
		
		switch(option){
			case 1:
				System.out.println("Operação 1: Saldo. ");
				System.out.println("\nSaldo RS:" + conta);
			break;
			
			case 2:
				System.out.println("Operação 2: Saque. ");
				System.out.print("Valor RS:");
				val = leia.nextFloat();
				
				if(conta < val){
					System.out.println("Operação inválida!!!");
				} else {
					joker = conta - val;
					System.out.println("\nNovo saldo RS:" + joker);
				}	
			break;
			
			case 3:
				System.out.println("Operação 3: Depósito. ");
				System.out.print("Valor RS:");
				val = leia.nextFloat();
				
				joker = val + conta;
				System.out.println("\nNovo saldo RS:" + joker);
				
			break;
			
			default: 
				System.out.println("Digite uma opcão valida.: ");
			
		}
		leia.close();

	}

}
