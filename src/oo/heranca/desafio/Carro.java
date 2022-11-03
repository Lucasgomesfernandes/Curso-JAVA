package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	 public int velocidade;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {

		if (velocidade + 5 > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += 4;
		}
	}

	public void frear() {

		if (velocidade >= 4) {
			velocidade -= 4;
		}
	}

}
