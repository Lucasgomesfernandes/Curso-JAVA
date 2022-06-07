package Fundamentos.Exercicios;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fah = scanner.nextDouble();
		double cel = ((fah-32)*5)/9;
		
		System.out.printf("A temperatura em celsius é: %.2f", cel);
	
		scanner.close();
	}

}
