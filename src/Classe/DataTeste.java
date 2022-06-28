package Classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1Construtor = new Data();

		var d2Construtor = new Data(11, 04, 2001);

		Data d1 = new Data();
		d1.dia = 7;
		d1.mes = 11;
		d1.ano = 2022;

		var d2 = new Data();
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2021;

		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		System.out.printf("\n%d/%d/%d\n", d2.dia, d2.mes, d2.ano);

		// depois da ciraçãodo metodo
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		// pelo construtor
		System.out.println(d1Construtor.obterDataFormatada());
		System.out.println(d2Construtor.obterDataFormatada());

		d1.imprimirDataFromatada();
		d2.imprimirDataFromatada();

	}

}
