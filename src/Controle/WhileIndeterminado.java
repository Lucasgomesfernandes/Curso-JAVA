package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String valor = "";

		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Digite 'sair' para sair do loop ");
			valor = scanner.nextLine();
		}

		System.out.println("Você saiu do loop");
		scanner.close();
	}

}
