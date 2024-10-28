package varEOperadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule
		 *  e mostre a diferença do produto entre o n1 e n2 pelo 
		 *  produto entre o n3 e o n4. Veja os exemplos abaixo:*/
		Scanner leia = new Scanner(System.in);
		
		System.out.print(" Programa para cálculo de produto");
		System.out.print("\n ***************************************");
		
		System.out.print("\n Digite o valor de n1: ");
		float sal = leia.nextFloat();
		System.out.print(" Digite o valor de n2: ");
		float adic = leia.nextFloat();
		System.out.print(" Digite o valor de n3: ");
		float extr = leia.nextFloat();
		System.out.print(" Digite o valor de n4: ");
		float desc = leia.nextFloat();
		float liquido = (sal * adic) - (extr * desc);
		
		System.out.print(" O produto de + n1 + n2 + n3 + n4, é: " + liquido);
	}

}
