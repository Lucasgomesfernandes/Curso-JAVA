package Fundamentos.Exercicios;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e da altura de um triangulo e calcule a area;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do triangulo: ");
		int base = scanner.nextInt();
		
		System.out.println("Digite o valor da altura do triangulo: ");
		int altura = scanner.nextInt();
		
		double area = (base*altura)/2;
		
		System.out.printf("A area do tringulo é: %.2f", area);
		
		scanner.close();
		
	}

}
