package Controle.Exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Criar um programa que receba um n�mero e diga se ele e um n�mero primo.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero para verificar se ele � primo: ");
		int numero = scanner.nextInt();

		int ContadorDivisores = 0;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				ContadorDivisores++;
			}
		}

		if (ContadorDivisores == 0) {
			System.out.println("Esse numero � primo");
		} else
			System.out.println("Esse numero nao � primo");

		scanner.close();
	}

}
