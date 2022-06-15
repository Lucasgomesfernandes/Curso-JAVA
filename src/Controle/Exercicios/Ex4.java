package Controle.Exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Criar um programa que receba um número e diga se ele e um número primo.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero para verificar se ele é primo: ");
		int numero = scanner.nextInt();

		int ContadorDivisores = 0;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				ContadorDivisores++;
			}
		}

		if (ContadorDivisores == 0) {
			System.out.println("Esse numero é primo");
		} else
			System.out.println("Esse numero nao é primo");

		scanner.close();
	}

}
