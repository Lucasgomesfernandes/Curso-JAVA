package Classe;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4;

	public static void main(String[] args) {

		// criar instancia para acessar o atributo a
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);

		// como b esta static nao precisa de instancia para acessarq
		System.out.println(b);

	}

}
