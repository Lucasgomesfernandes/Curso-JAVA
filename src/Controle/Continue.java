package Controle;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			if (i % 2 == 1) {
				continue; // interrompe apenas uma interação e continua o laço for
			}
			System.out.println(i);
		}

		// desse jeito vai pular o numero 5
		for (int i = 0; i < 20; i++) {
			if (i == 5) {
				continue; // interrompe apenas uma interação e continua o laço for
			}
			System.out.println(i);
		}

	}

}
