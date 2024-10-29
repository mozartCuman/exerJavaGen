package varEOperadores;

import java.util.Scanner;

public class ExerIfEl4 {
	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia 3 palavras (String),
		 *  que definem as características de um tipo de animal possível
		 *  segundo o diagrama abaixo, que deve ser lido da esquerda
		 *  para a direita.*/
		
		Scanner leia = new Scanner(System.in);
		
		int esqueleto, tipo, gene;
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("\n Selecione o numero correspondente a pesquisa do ser desejado...");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.print("O ser é [1]vertebrado / [2]invertebrado]: ");
		esqueleto = leia.nextInt();
		
		
		if(esqueleto == 1) {
			
			System.out.print("O ser é [1]ave / [2]mamifero: ");
			tipo = leia.nextInt();
			
			if(tipo == 1) {
				System.out.print("O ser é [1]carnivoro / [2]onivoro]: ");
				gene = leia.nextInt();
				
				if(gene == 1) {
					System.out.println(" É uma ÁGUIA");
				} else {
					System.out.println(" É uma POMBA");
				}
				
			} else {
				System.out.print("O ser é [1]onivoro / [2]herbivoro: ");
				gene = leia.nextInt();
				
				if(gene == 1) {
					System.out.println(" É HUMANO");
				} else {
					System.out.println(" É uma VACA");
				}
			}
			
		} else {
			System.out.print("O ser é [1]inseto / [2]anelideo]: ");
			tipo = leia.nextInt();
			
			if(tipo == 1) {
				System.out.print("O ser é [1]hematofago / [2]herbivoro]: ");
				gene = leia.nextInt();
				
				if(gene == 1) {
					System.out.println(" É uma PULGA");
				} else {
					System.out.println(" É uma LAGARTA");
				}
				
			} else {
				System.out.print("O ser é [1]hematofago / [2]onivoro]: ");
				gene = leia.nextInt();
				
				if(gene == 1) {
					System.out.println(" É SANGUESSUGA");
				} else {
					System.out.println(" É uma MINHOCA");
				}
			}	
		}
		//leia.close();
	
 /* Me aproveitei de ser um exercicio e fiz de duas formas, em cima eu 
 * preferi usar numeros como referencia, mas nesse segundo eu fiz o
 *  metodo por String:
 *  
 * No Java utilize o Método String.equals() ou String.equalsIgnoreCase()
 * para comparar as palavras
*/
	
		//Scanner leia = new Scanner(System.in);
		
		String esqueletoo, tipoo, genee;
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("\n Digite o correspondente da pesquisa do ser desejado...");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.print("O ser é vertebrado / invertebrado]: ");
		esqueletoo = leia.next();
		
		
		if(esqueletoo.equalsIgnoreCase("vertebrado")) {
			
			System.out.print("O ser é ave / mamifero: ");
			tipoo = leia.next();
			
			if(tipoo.equalsIgnoreCase("ave")) {
				System.out.print("O ser é carnivoro / onivoro]: ");
				genee = leia.next();
				
				if(genee.equalsIgnoreCase("carnivoro")) {
					System.out.println(" É uma ÁGUIA");
				} else {
					System.out.println(" É uma POMBA");
				}
				
			} else {
				System.out.print("O ser é onivoro / herbivoro: ");
				genee = leia.next();
				
				if(genee.equalsIgnoreCase("onivoro")) {
					System.out.println(" É HUMANO");
				} else {
					System.out.println(" É uma VACA");
				}
			}
			
		} else {
			System.out.print("O ser é inseto / anelideo]: ");
			tipoo = leia.next();
			
			if(tipoo.equalsIgnoreCase("inseto")) {
				System.out.print("O ser é hematofago / herbivoro: ");
				genee = leia.next();
				
				if(genee.equalsIgnoreCase("hematofago")) {
					System.out.println(" É uma PULGA");
				} else {
					System.out.println(" É uma LAGARTA");
				}
				
			} else {
				System.out.print("O ser é hematofago / onivoro]: ");
				genee = leia.next();
				
				if(genee.equalsIgnoreCase("hematofago")) {
					System.out.println(" É SANGUESSUGA");
				} else {
					System.out.println(" É uma MINHOCA");
				}
			}	
		}
		leia.close();
	}
}
