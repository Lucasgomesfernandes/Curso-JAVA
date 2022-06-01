package Fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		//Trabalho na terça (V ou F) ;
		//Trabalho na quinta (V ou F) ; 

		boolean trabalho1;
		boolean trabalho2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Responda com true ou false");
		
		System.out.println("O primeiro trabalho deu certo? ");
		trabalho1 = scanner.nextBoolean();
		
		System.out.println("O segundo trabalho deu certo? ");
		trabalho2 = scanner.nextBoolean();
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean ficouEmCasa = !sorvete;
						
		System.out.println("Comprou TV 50: ");
		System.out.println(tv50);
		
		System.out.println("Comprou TV 32: ");
		System.out.println(tv32);
		
		System.out.println("Tomou Sorvete: ");
		System.out.println(sorvete);
		
		System.out.println("Ficou em casa: ");
		System.out.println(ficouEmCasa);
		
	}

}
