package varEOperadores;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis 
		do tipo float e exiba na tela a média final do participante*/
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print(" Programa de Média básico");
		System.out.print("\n ***************************************");
		System.out.print("\n Qual o nome do aluno?: ");
		String nome = leia.next();
		
		
		
		System.out.print("\n Primeira nota: ");
		float alun1 = leia.nextFloat();
		System.out.print("\n Segunda nota: ");
		float alun2 = leia.nextFloat();
		System.out.print("\n terceira nota: ");
		float alun3 = leia.nextFloat();
		System.out.print("\n Média do segundo aluno: ");
		float alun4 = leia.nextFloat();
		
		float media = (alun1 + alun2 + alun3 + alun4) / 4;
		
		System.out.print("\n O aluno "+ nome + " teve a média: ");
		System.out.println(df.format(media));
		
	}

}
