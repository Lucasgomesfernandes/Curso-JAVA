package Classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	// construtor
	// deve ter o mesmo nome da classe
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	// um construtor nao tem uma variavel de retorno, somente de entrada, se colocar
	// uma variavel de retorno vira uma metodo
	Produto() {

	}

	// estrutura de um metodo
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

}
