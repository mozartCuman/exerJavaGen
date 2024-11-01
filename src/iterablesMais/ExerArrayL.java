package iterablesMais;

import java.util.ArrayList;
import java.util.Scanner; 

public class ExerArrayL {

	public static void main(String[] args) {
		/*Escreva um programa Java para criar uma Collection ArrayList 
		 * de Objetos da Classe String. O programa deverá solicitar ao 
		 * usuário, que ele digite via teclado 5 cores e deverá adicioná-las 
		 * individualmente no ArrayList. Em seguida, faça o que se pede:
			Mostre na tela todas as cores que foram adicionadas. 
			Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.*/ 
		
		ArrayList <String> aCores = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("Entre com a " + (i + 1) + "ª cor: ");
			aCores.add(leia.next());
		}
		
		leia.close();
		
		System.out.println("\n Lista de todas as cores inseridas: \n");
		
		for(String cor : aCores) {
			System.out.println("- " + cor);
		}
		
		aCores.sort(null);
		
		System.out.println("\n Lista das cores ordenadas: \n");
		
		for(String cor : aCores) {
			System.out.println("- " + cor);
		}
		
	}

}
