package Controle.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
		// numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
		// o número gerado. Ao final de cada tentativa, imprima a quantidade de
		// tentativas restantes, e imprima se o número inserido é maior ou menor do que
		// o número armazenado.

		Scanner scanner = new Scanner(System.in);
		int tentativas;
		int numeroSorteado;
		int numeroEscolhido;
		int sairDoJogo = 1;

		do {
			System.out.println("Sorteando um numero entre 0 e 100...");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			tentativas = 1;

			System.out.println("Tente adivinhar um numero entre 0 a 100, você tem 10 tentativas");
			do {
				System.out.printf("\n%d tentativa", tentativas);
				numeroEscolhido = scanner.nextInt();

				if (numeroEscolhido < numeroSorteado) {
					System.out.println("Numero escolhido é menor que  o numero sorteado");
				} else if (numeroEscolhido > numeroSorteado) {
					System.out.println("Numero escolhido é maior que  o numero sorteado");
				}
				System.out.println(numeroSorteado);
				tentativas++;
			} while (numeroEscolhido != numeroSorteado && tentativas != 11);

			if (numeroEscolhido == numeroSorteado) {
				System.out.println("Parabens vc acertou ;)");
			} else {
				System.out.println("poxa nao foi dessa vez :(");
			}
			System.out.println("Quer continuar jogando? digite 0 para sair ou qualquer outro numero para continuar");
			sairDoJogo = scanner.nextInt();

		} while (sairDoJogo != 0);

		scanner.close();
	}

}
