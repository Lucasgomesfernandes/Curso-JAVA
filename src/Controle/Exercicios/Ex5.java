package Controle.Exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Refatorar o exercício 04, utilizando a estrutura switch.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero para verificar se ele é primo: ");
		int numero = scanner.nextInt();

		int ContadorDivisores = 0;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				ContadorDivisores++;
			}
		}

		switch (ContadorDivisores) {
		case 0:
			System.out.println("Esse numero é primo");
			break;
		default:
			System.out.println("Esse numero nao é primo");
		}

		scanner.close();

	}

}
