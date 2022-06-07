package Fundamentos.Exercicios;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		// Criar um programa que leia o peso e a altura do usuario e imprima no console o IMC;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu peso(em kg): ");
		String peso = scanner.next().replace(",", ".");
		double peso1 = Double.parseDouble(peso);
		
		System.out.println("Digite sua altura(em metros): ");
		String altura = scanner.next().replace(",", ".");
		double altura1 = Double.parseDouble(altura);

		double IMC = peso1/Math.pow(altura1, 2);
		
		System.out.printf("Seu IMC é: %.2f", IMC);
		
		scanner.close();
	}

}
