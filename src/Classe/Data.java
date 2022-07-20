package Classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
	}

	String obterDataFormatada() {
		final String formato = "%d / %d / %d";
		return String.format(formato, dia, mes, ano);
	}

	// selecionar o tipo de retorno como void, significa ausencia de retorno
	void imprimirDataFromatada() {
		System.out.println(obterDataFormatada());
	}

}
