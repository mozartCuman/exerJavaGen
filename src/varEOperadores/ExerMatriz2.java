package varEOperadores;

import java.util.Scanner;

public class ExerMatriz2 {

	public static void main(String[] args) {
		/*Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 
		 * 4 bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma linha 
		 * de uma matriz de números reais, logo cada linha da matriz serão as notas de um 
		 * participante. Em um vetor de números reais, armazene as médias de cada participante e
		 *  exiba as médias de cada um na tela.*/
		
		Scanner leia = new Scanner(System.in);
		
		float bime[][] = new float[10][4], mediador[] = new float[10], somador = 0;
		
		
		
		System.out.println(" Lista de participantes: ");
		
		for(int x = 0; x < 10; x++) {
			
			System.out.println("  ");
			
			for(int y = 0; y < 4; y++) {
				
				System.out.print((x + 1) + "º estudante "+ (y + 1) +"ª nota: ");
				bime[x][y] = leia.nextFloat();
				
				somador += bime[x][y];
			}
			
			mediador[x] += somador / 4;
			somador = 0;
		}
		
		leia.close();
		
		System.out.println("\n Média dos estudantes: \n");
		for(int i = 0; i < mediador.length; i++) {
			System.out.println((i + 1) + "º estudante, média: " + mediador[i] + " ");
		}

	}

}
