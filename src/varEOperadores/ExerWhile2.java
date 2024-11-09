package varEOperadores;

import java.util.Scanner;

public class ExerWhile2 {

	public static void main(String[] args) {
		//Exercicio 4 da apostila 3, While (Generation).
		Scanner leia = new Scanner(System.in);
		
		byte master = 0 , gener = 0, mCis = 0, hCis = 0, nBin = 0, mTra = 0, hTra = 0, outr =0, desen = 0, bEnd = 0, fEnd = 0, mobi = 0, idade, wwFront = 0, full = 0;
		byte shMobile = 0, nbFull = 0, cont = 0;
		float idadeM = 0;
		boolean fim = true;
		String whon;
		
		System.out.println(" !!! Bem Vindx ao Senso !!! \n");
		System.out.print(" Quantas pessoas gostaria de adicionar???:");
		master = leia.nextByte();
		System.out.println("\n*****************************************************************");
		
		
		while (fim == true) {
			
			cont += 1;
			
			System.out.print("Qual a idade da " + cont +"º pessoa?: ");
			idade = leia.nextByte();
			idadeM += idade;
			
			//while(gener < 1 && gener > 6) {
				
			System.out.println("\n*****************************************************************");
			System.out.println("\n Qual a identidade de genero?");
			System.out.println(" - 1 Mulher Cis");
			System.out.println(" - 2 Homem Cis");
			System.out.println(" - 3 Não Binário");
			System.out.println(" - 4 Mulher Trans");
			System.out.println(" - 5 Homem Trans");
			System.out.println(" - 6 Outros");
			System.out.print("\n Opção: ");
			gener = leia.nextByte();
		
		
			switch (gener) {
				case 1:
					mCis += 1;
				break;
				case 2:
					hCis += 1;
				break;
				case 3:
					nBin += 1;
				break;
				case 4:
					mTra += 1;
				break;
				case 5:
					hTra += 1;
				break;
				case 6:
					outr += 1;
				break;
				default: System.out.println(" Escolha uma opção valida!!!");
				}
			
			//}
			
			
			System.out.println("\n*****************************************************************");
			System.out.println("\n Pessoa desenvolvedora: ");
			System.out.println(" - 1 Backend");
			System.out.println(" - 2 Frontend");
			System.out.println(" - 3 Mobile");
			System.out.print(" - 4 FullStack");
			desen = leia.nextByte();
			
			switch (desen) {
			case 1:
				bEnd += 1;
			break;
			case 2:
				fEnd += 1;
			break;
			case 3:
				mobi += 1;
			break;
			case 4:
				full += 1;
			break;
			default: System.out.println(" Escolha uma opção valida!!!");
			}
			
			
			if (gener == 4 && desen == 2 || gener == 1 && desen == 2 ) {
				wwFront += 1;
			}
			
			if (gener == 2 && idade > 40 && desen == 3  || gener == 5 && idade > 40 && desen == 3 ) {
				shMobile += 1;
			}
			
			if (gener == 3 && idade < 30 && desen == 4) {
				nbFull += 1;
			}
			
			master -= 1;
			
			if(master == 0) {
				System.out.println("Gostaria de continuar??? [S/N]: ");
				whon = leia.next();
				if (whon.equalsIgnoreCase("n")) {
					fim = false;
				} else {
					System.out.print(" Mais quantas pessoas gostaria de adicionar???: \n");
					master = leia.nextByte();
				}
			}	
		}
		
		leia.close();
		
		System.out.println("\n*****************************************************************");
		System.out.println("\n*****************************************************************");
		System.out.println("\n Desenvolvedores Backend:" + bEnd);
		System.out.println(" Mulheres Trans e Cis desenvolvedoras Frontend:" + wwFront);
		System.out.println(" Homens Trans e Cis desenvolvedores Mobile com mais de 40 anos:" + shMobile);
		System.out.println(" O número de Não Binários desenvolvedores FullStack menores de 30 anos:" + nbFull);
		System.out.println(" O número total de pessoas que responderam à pesquisa:" + (mCis + hCis + nBin + mTra + hTra + outr));
		System.out.println(" A media de idade das pessoas que responderam a pesquisa: " + idadeM / (mCis + hCis + nBin + mTra + hTra + outr));
		System.out.println("\n*****************************************************************");
		System.out.println("\n                         !!!   END PROGRAM   !!!");
		System.out.println("\n*****************************************************************");
		System.out.println("\n*****************************************************************");
		
	}

}



























