package varEOperadores;

import java.util.Scanner;

public class ExerIfEl3 {

	public static void main(String[] args) {
		/*Para doar sangue é necessário ter entre 18 e 69 anos de 
		 * idade. Pessoas com idade entre 60 e 69 anos, só podem doar 
		 * se não for a sua primeira doação. Escreva um Algoritmo em 
		 * Java que obtenha via teclado o nome do doador (String), a 
		 * idade (inteiro) do doador e se é a primeira doação (boolean).
		 *  De acordo com as Regras para a doação, mostre na tela se o
		 *   doador está Apto ou Não Apto para doar sangue.*/ 

		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		boolean first;
		
		System.out.print(" Digite o nome: ");
		nome = leia.next();
		System.out.print(" Digite a idade: ");
		idade = leia.nextInt();
		System.out.print(" Primeira vez doando [true/false] ?: ");
		first = leia.nextBoolean();
		
		leia.close();
		
		if(idade > 17 && idade < 60) {
			System.out.println("Paciente: " + nome + ", esta com permissão para doar.");
		}else if(idade >= 60 && idade < 70 && first == false) {
			System.out.println("Paciente: " + nome + ", esta com permissão para doar.");
		}else {
			System.out.println("Paciente: " + nome + ", não esta com permissão para doar.");
		}
	}

}
