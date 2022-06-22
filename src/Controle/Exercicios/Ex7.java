package Controle.Exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// Criar um programa que enquanto estiver recebendo números positivos, imprime
		// no console a soma dos números inseridos, caso receba um número negativo,
		// encerre o programa. Tente utilizar a estrutura do while.

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int auxiliar = 0;

		do {

			System.out.println("\nDigite um numero para ser somado: ");
			num = scanner.nextInt();
			
			if (num > 0) {
				auxiliar += num;
			}
			System.out.printf("\nA soma esta em %d ", auxiliar);

		} while (num >= 0);

		scanner.close();
	}

}
