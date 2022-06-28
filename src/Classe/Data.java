package Classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}

	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	String obterDataFormatada() {
		return String.format("%d / %d / %d", dia, mes, ano);
	}

	// selecionar o tipo de retorno como void, significa ausencia de retorno
	void imprimirDataFromatada() {
		System.out.println(obterDataFormatada());
	}
}
