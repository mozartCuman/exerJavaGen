package pilhaFila;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class ExerFila {

	public static void main(String[] args) {
		/*
		 * Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo
		 * string, para organizar uma fila por ordem de chegada dos Clientes de um
		 * Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1:
		 * Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente. 2:
		 * Listar todos os Clientes na fila 3: Chamar (retirar) uma pessoa da fila 0: O
		 * programa deve ser finalizado. Caso a fila esteja vazia, o programa deverá
		 * informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.
		 */
		Scanner leia = new Scanner(System.in);
		Queue<String> filaBanco = new LinkedList<String>();
		String coringa;
		int escolha, fatal = 1;

		System.out.println("**************************************************");
		System.out.println("**********************-MENU-**********************");
		System.out.println(" 1- Adicionar Cliente na fila. ");
		System.out.println(" 2- Listar todos os clientes. ");
		System.out.println(" 3- Retirar cliente da fila. ");
		System.out.println("\n 0- SAIR ");
		System.out.println("**************************************************");

		while (fatal != 0) {

			System.out.print("\n Selecione a opção:");
			escolha = leia.nextInt();

			switch (escolha) {
			case 1:
				System.out.print("\n Nome: ");
				filaBanco.add(leia.nextLine());
				System.out.println("Adicionado com sucesso...");
				break;
			case 2:

				if (filaBanco.isEmpty() == true) {
					System.out.println("\n A fila esta vazia... \n");
					break;
				} else {
					System.out.println("\n**************************************************");
					System.out.println("Fila:\n");
					for (String x : filaBanco) {
						System.out.println("-" + x);
					}
					System.out.println("**************************************************");
					break;
				}
			case 3:

				if (filaBanco.isEmpty() == true) {
					System.out.println("\n A fila esta vazia... \n");
					break;
				} else {
					System.out.println("\n O cliente: " + filaBanco.poll() + " foi chamado.");
					System.out.println("\n**************************************************");
					if (filaBanco.isEmpty() == true) {
						System.out.println("\n A fila esta vazia... \n");
						
					}else {
						System.out.println("Nova fila:\n");
						for (String x : filaBanco) {
							System.out.println("-" + x);
						} 
						
					}
					System.out.println("**************************************************");

					break;
				}
			case 0:
				fatal = 0;
				break;
			default:
				System.out.println("\n Selecione uma opção valida: ");

			}
		}

		leia.close();

		System.out.println("\n=-=-=-=-=-=-=-=-=-=END PROGRAM-=-=-=-=-=-=-=-=-=\n");

	}

}
