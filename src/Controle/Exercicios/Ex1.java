package Controle.Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Criar um programa que receba um número e verifique se ele está entre 0 e 10
		// e é par;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		double numero = scanner.nextDouble();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0)
				System.out.printf("o numero %f esta entre 0 e 10 e é par", numero);
			else if (numero % 2 == 1)
				System.out.printf("o numero %f esta entre 0 e 10 mas nao é par", numero);
		} else
			System.out.printf("o numero %f nao esta entre 0 e 10", numero);

		scanner.close();
	}

}
