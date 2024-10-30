package varEOperadores;

import java.util.Scanner;

public class ExerWhile {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
		 *  via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e 
		 *  o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser 
		 *  finalizada ao digitar uma idade negativa.*/

		Scanner leia = new Scanner(System.in);
		
		int enu = 0, joker = 0, menor = 0, mid = 0, bests = 0;
		boolean para = true;
		
		System.out.println("---Lista de gerações!---\n");
		
		while (para == true) {
			
			enu += 1;
			
			System.out.print(" Digite a idade da " + enu + " pessoa.:");
			joker = leia.nextInt();
			
			if(joker < 21 && joker > 0) {
				menor += 1;
			} else if (joker >= 21 && joker <= 50){
				mid += 1;
			} else if (joker < 1) {
				para = false;
			} else {
				bests += 1;
			}	
		}
		
		leia.close();
		
		System.out.println("\n Nas idades tivemos: \n");
		System.out.println(menor + " Pessoas menores de 21 anos.");
		System.out.println(mid + " Pessoas de meia idade.");
		System.out.println(bests + " Pessoas menores de 50 anos.");
	}

}
