package varEOperadores;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio3 {

	public static void main(String[] args) {
		/* Elabore um algoritmo em Java, que leia o Salário Bruto, o
		 *  Adicional Noturno, as Horas Extras e os Descontos de um 
		 *  Colaborador, em variáveis do tipo float e exiba na tela o 
		 *  Salário Líquido. */
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print("\n Qual o nome do colaborador?: ");
		String nome = leia.next();
		
		System.out.print(" Digite o salário bruto: ");
		float sal = leia.nextFloat();
		System.out.print(" Digite o adicional noturno: ");
		float adic = leia.nextFloat();
		System.out.print(" Digite as horas extras: ");
		float extr = leia.nextFloat();
		System.out.print(" Digite os descontos: ");
		float desc = leia.nextFloat();
		float liquido = sal + adic + (extr * 5) - desc;
		leia.close();
		
		System.out.println("*****************************************************");
		System.out.println("\n O salário liquido de: "+ nome + " é:" + df.format(liquido) + " ...");
		
	}

}
//SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS
