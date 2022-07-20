package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantas notas: ");
		int quantidadeDeNotas = scanner.nextInt();

		double[] notas = new double[quantidadeDeNotas];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notas[i] = scanner.nextDouble();
		}

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		double media = total / notas.length;
		System.out.println("Amedia é " + media + "!");
		scanner.close();
	}

}
