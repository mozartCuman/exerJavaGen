package varEOperadores;

import java.util.Scanner;

public class ExerIfEl1 {

	public static void main(String[] args) {
		/*FaçaumalgoritmoemJavaqueleia3valoresinteirosA, B e C e imprima na tela se a
		 soma de A + B é maior, menor ou igual a C.*/
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.print(" Digite o valor de 'A': ");
		a = leia.nextInt();
		System.out.print(" Digite o valor de 'B': ");
		b = leia.nextInt();
		System.out.print(" Digite o valor de 'C': ");
		c = leia.nextInt();
		
		leia.close();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println(" A soma de A:" + a + " + B:" + b + " é " + soma + ", logo maior que C:" + c);
		}else if(soma == c ){
			System.out.println(" A soma de A:" + a + " + B:" + b + " é " + soma + ", logo igual que C:" + c);
		}else {
			System.out.println("\n A soma de A:" + a + " + B:" + b + " é " + soma + ", logo menor que C:" + c);
		}
		
	}

}
