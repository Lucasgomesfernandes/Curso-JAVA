package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o dia da Semana: ");
		String dia = scanner.next();

		//Nao usar == com String, usar equals
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1 dia da semana");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("2 dia da semana");
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("3 dia da semana");
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("4 dia da semana");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("5 dia da semana");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("6 dia da semana");
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("7 dia da semana");
		} else {
			System.out.println("Dia invalido");
		}

		scanner.close();

	}

}
