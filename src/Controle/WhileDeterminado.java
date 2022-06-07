package Controle;

public class WhileDeterminado {

	public static void main(String[] args) {

		int contador = 1;

		while (contador <= 10) {
			System.out.printf("\ni = %d", contador);
			contador++;
		}

		contador = 1;
		while (contador <= 20) {
			System.out.printf("\ni = %d", contador);
			contador += 2;
		}
	}

}
