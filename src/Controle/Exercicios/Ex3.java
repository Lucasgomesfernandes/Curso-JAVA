package Controle.Exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Criar um programa que receba duas notas parciais, calcular a média final. Se
		// a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a
		// nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
		// caso contrário imprime no console "Reprovado".

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite as notas do aluno: ");
		double nota1 = scanner.nextDouble();
		double nota2 = scanner.nextDouble();
		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("O aluno esta APROVADO! ");
		} else if (media < 7 && media > 4) {
			System.out.println("O aluno esta de RECUPERAÇÃO! ");
		} else {
			System.out.println("O aluno esta REPROVADO! ");
		}
		
		scanner.close();
	}

}
