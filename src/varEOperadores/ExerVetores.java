package varEOperadores;

import java.util.Scanner;
 

public class ExerVetores {

	public static void main(String[] args) {
		/*Dado um vetor contendo 10 números inteiros não ordenados e não 
		 * repetidos, construa um algoritmo que consiga pesquisar dados no 
		 * vetor, onde o usuário irá digitar um número e o programa deve 
		 * exibir na tela a posição deste número no vetor. Caso o número 
		 * não seja encontrado, a mensagem: “Não foi encontrado!” deve ser e
		 * xibida na tela.*/  

		Scanner leia = new Scanner(System.in);
		
		int veveto [] = {2,5,1,3,4,9,7,8,10,6}, compare = 0;
		byte errado = 1;
		
		System.out.println(" Qual número gostaria de saber a posição?");
		compare = leia.nextInt();
		
		leia.close();
		
		for(int i = 0; i < veveto.length; i++) {
			
			if(veveto[i] == compare) {
				System.out.println(" O número " + compare + " está na posição " + i );
				errado = 2;
				
				break;
				
			} 	
		} 
		
		if (errado == 1) {
				System.out.println(" O número " + compare + " não se encontra na lista...");
		}
		
	}
}
