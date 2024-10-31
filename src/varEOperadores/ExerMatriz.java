package varEOperadores;

import java.util.Scanner;

public class ExerMatriz {

	public static void main(String[] args) {
		/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida,
		 *  mostre na tela:
		Todos os elementos da Diagonal Principal
		Todos os elementos da Diagonal Secundária
		A Soma de todos os elementos da Diagonal Principal
		A Soma de todos os elementos da Diagonal Secundária*/ 
		
		Scanner leia = new Scanner(System.in);
		
		int [][]xyMa = new int[3][3];
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				
				System.out.print( "Entre com a casa " + x + ","+ y + ": ");
				xyMa[x][y] = leia.nextInt();
			}
		}
		
		leia.close();
		
		System.out.println("\n Diagonal Principal: " + xyMa[0][0] + ", " + xyMa[1][1] + ", " + xyMa[2][2]);
		System.out.println(" Diagonal Secundaria: " + xyMa[0][2] + ", " + xyMa[1][1] + ", " + xyMa[2][0]);
		System.out.println(" Soma da Principal: " + (xyMa[0][0] + xyMa[1][1] + xyMa[2][2]));
		System.out.println(" Soma da Secundaria: " + (xyMa[0][2] + xyMa[1][1] + xyMa[2][0]));
		
	}

}






















 

 






