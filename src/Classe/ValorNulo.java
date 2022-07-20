package Classe;

public class ValorNulo {

	public static void main(String[] args) {

		// nao acessar atributos nem metodos que podem ser nulos
		// pode gerar um erro nullPointerException

		String s1 = "";
		System.out.println(s1.concat("!!!!!!"));

		// Math.random gera um numero aleatorio entre 0 e 1
		Data d1 = Math.random() > 0.5 ? new Data() : null;

		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}

		String s2 = Math.random() > 0.5 ? "Opa" : null;
		if (s2 != null) {
			System.out.println(s2.concat("??????"));
		}

	}

}
