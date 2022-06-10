package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// if(...) senten�a; ou {}
		// while(...) senten�a; ou {}
		// for(...; ...; ...) sentenca; ou {}
		// do {} while(...);

		Scanner scanner = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Voce precisa falar as palavras magicas...");
			System.out.println("Quer sair? ");
			texto = scanner.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado");
		
		scanner.close();
	}

}
