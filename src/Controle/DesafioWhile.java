package Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// calcular a media das notas de uma turma

		Scanner scanner = new Scanner(System.in);

		double media; // media da turma
		double nota; // nota de cada aluno
		double total = 0; // soma das notas;
		int contadorNotasValidas = 0; 
		int aux = 1;

		while (aux != -1) {

			System.out.println("Digite a nota do aluno: ");
			nota = scanner.nextDouble();

			if (nota >= 0 && nota <= 10) {
				total += nota;
				contadorNotasValidas++;
			} else
				System.out.println("ERRO! \nDigite uma nota valida!");

			System.out.println("Se quiser continuar cadastrando notas digite 1, se nao, digite -1: ");
			aux = scanner.nextInt();
			
		}
		
		media = total/contadorNotasValidas;
		System.out.printf("\nA media de todos os alunos foi de %.2f", media);
		scanner.close();

	}

}
