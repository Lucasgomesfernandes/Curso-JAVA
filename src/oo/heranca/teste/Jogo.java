package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println("Vida do jogador monstro: " + monstro.vida);
		System.out.println("Vida do jogador heroi: " + heroi.vida);

		monstro.atacar(heroi);
		monstro.atacar(heroi);

		heroi.atacar(monstro);
		heroi.atacar(monstro);

		System.out.println("Vida do jogador monstro: " + monstro.vida);
		System.out.println("Vida do jogador heroi: " + heroi.vida);

		monstro.andar(Direcao.SUL);
		monstro.andar(Direcao.OESTE);
		monstro.andar(Direcao.SUL);
		monstro.andar(Direcao.OESTE);

		System.out.println("x = " + monstro.x);
		System.out.println("y = " + monstro.y);

	}

}
