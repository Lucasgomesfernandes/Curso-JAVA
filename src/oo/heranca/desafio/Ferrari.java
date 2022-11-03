package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public Ferrari() {
		this(300);
	}

	@Override
	public void acelerar() {
		velocidade += 15;
	}

	@Override
	public void frear() {
		if (velocidade > 0) {
			velocidade -= 15;
		}

	}

	@Override
	public void ligarTurbo() {
		velocidade += 35;
	}

	@Override
	public void desligarTurbo() {
		velocidade -= 35;
	}
}
