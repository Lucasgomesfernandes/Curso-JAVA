package Fundamentos.Exercicios;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digie um valor: ");
		String val = scanner.next().replace(",", ".");
		double valor = Double.parseDouble(val);
		
		double resultadoAoQuadrado = Math.pow(valor, 2);
		double resultadoAoCubo = Math.pow(valor, 3);
		
		System.out.printf("O valor ao quadrado ficou: %.2f", resultadoAoQuadrado);
		System.out.printf("\nO valor ao cubo ficou: %.2f", resultadoAoCubo);
		
		scanner.close();
	}

}
