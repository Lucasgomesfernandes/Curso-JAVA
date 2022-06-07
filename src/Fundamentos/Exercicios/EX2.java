package Fundamentos.Exercicios;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double cel = scanner.nextDouble();
		double fah = ((cel*9)/5)+32;
		
		System.out.printf("A temperatura em fahrenheit é: %.2f", fah);
		
		scanner.close();
	}

}
