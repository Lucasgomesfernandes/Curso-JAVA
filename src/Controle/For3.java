package Controle;

public class For3 {

	public static void main(String[] args) {

		// desse jeito a variavel i so pode ser usada dentro desse la�o
		//se necessario usar a variavel fora do la�o, precisa declarar ela fora do for
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("\n\n[%d %d]", i, j);
			}
		}
	}

}
