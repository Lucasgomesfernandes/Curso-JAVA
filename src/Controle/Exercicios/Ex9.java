package Controle.Exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// Crie um programa que recebe 10 valores e ao final imprima o maior número.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 10 numeros: ");
		int aux = scanner.nextInt();

		for (int i = 1; i < 10; i++) {
			int numero = scanner.nextInt();
			if (numero > aux) {
				aux = numero;
			}
		}
		System.out.printf("O maior numero digitado foi %d", aux);

		scanner.close();
	}

}
