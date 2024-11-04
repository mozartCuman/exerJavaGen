package pilhaFila;

import java.util.Stack;
import java.util.Scanner;
import java.util.Iterator;

public class ExerPilha {

	public static void main(String[] args) {
		/*
		 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string,
		 * para organizar a retirada de livros de uma pilha. O programa deverá ter um
		 * Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar um novo livro na pilha.
		 * Deve solicitar o nome do livro. 2: Listar todos os livros da Pilha 3: Retirar
		 * um livro da pilha 0: O programa deve ser finalizado. Caso a pilha esteja
		 * vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a
		 * pilha está vazia.
		 */

		Stack<String> livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);

		int fim = 1, seletor;

		System.out.println("**************************************************");
		System.out.println("**********************-MENU-**********************");
		System.out.println(" 1- Adicionar um novo livro. ");
		System.out.println(" 2- Listar todos os livros na pilha. ");
		System.out.println(" 3- Retirar um livro da pilha. ");
		System.out.println("\n 0- SAIR ");
		System.out.println("**************************************************");

		while (fim != 0) {
			
		
			System.out.print("Selecione: ");
			seletor = leia.nextInt();

			if (seletor == 1) {
				System.out.print(" Nome do livro: ");
				
				livros.push(leia.nextLine());
				
				
				System.out.println("Adicionado com sucesso.");

			} else if (seletor == 2) {

				if (livros.isEmpty() == false) {
					System.out.println(" Livros na pilha: ");
					Iterator<String> ler = livros.iterator();
					while (ler.hasNext()) {
						System.out.println("-" + ler.next());
					}
				}
			} else if (seletor == 3) {
				System.out.println(" O livro " + livros.pop() + " foi retirado.");

			} else if (seletor == 0) {
				fim = 0;

			} else {
				System.out.print(" Digite uma opção valida...:");
			}

		}

		leia.close();
		 

		System.out.println("\n=-=-=-=-=-=-=-=-=-=END PROGRAM-=-=-=-=-=-=-=-=-=\n");

	}

}
