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
		
		/* Outra opção para o exercicio:
		System.out.println("Digite a palavra: ");
		String palavra = scanner.nextLine();

		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}*/
		

		scanner.close();
	}

}
