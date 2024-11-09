package varEOperadores;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Dado o fluxograma, desenvolva o algoritmo na linguagem
		//inicio --> digite o salario --> digite o abono --> leia o abono -->
		//novo salario = salario + abono --> exibe o novo salario --> FIM
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		
		System.out.println(" --PROGRAMA PARA ABONO SALÁRIAL!!!--");
		System.out.println("*****************************************************************************************");
		System.out.print("\n Digite o salário (com centavos) : ");
		float sala = leia.nextFloat();
		System.out.println("*****************************************************************************************");
		
		
		System.out.print(" Quantos meses o funcionário trabalhou "
				+ "para podermos calcular o abono salarial???: ");
		float abon = leia.nextFloat();
		leia.close();
		
		float abonII = (sala * abon)/12;
		
		double abonoS = 0;
		
		if(abonII > 1412) {
			abonoS = 1412.00;
		}else {
			abonoS = abonII;
		}
		System.out.println("*****************************************************************************************");
		System.out.print(" ");
		System.out.println("\n O abono salárial é de RS:" + df.format(abonoS) + " ...");
		System.out.println(" O salário do funcionário com o pagamento do abono este mês é RS:" + df.format(abonoS + sala) + " ...");
		
	}

}
/* 1º Exemplo:
Um trabalhador exerceu atividade durante 4 meses em 2022. Veja o cálculo como fica.

SM x MT/12

1.412 x 4 /12

5.648/12 = 470,66

 link utilizado para a pesquisa: https://calculocerto.com/calcular-valor-do-abono-salarial/*/