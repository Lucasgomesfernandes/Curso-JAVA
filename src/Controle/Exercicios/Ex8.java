package Controle.Exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// Criar um programa que receba uma palavra e imprime no console letra por
		// letra.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma palavra qualquer");
		String palavra = scanner.nextLine();
		int auxiliar = palavra.length();

		for (int i = 0; i < auxiliar; i++) {
			palavra.charAt(i);
			System.out.println(i + " - " + palavra.charAt(i));
		}

		scanner.close();
	}

}
