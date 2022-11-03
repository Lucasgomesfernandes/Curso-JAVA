package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteVelocidade {

	public static void main(String[] args) {

		Carro c1 = new Civic();
		Carro f1 = new Ferrari();

		System.out.println("Velocidade do carro 1: " + c1.velocidade);
		System.out.println("Velocidade do carro 2: " + f1.velocidade);

		c1.acelerar();
		f1.acelerar();

		System.out.println("Velocidade do carro 1: " + c1.velocidade);
		System.out.println("Velocidade do carro 2: " + f1.velocidade);

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		f1.acelerar();
		f1.acelerar();
		f1.acelerar();

		System.out.println("Velocidade do carro 1: " + c1.velocidade);
		System.out.println("Velocidade do carro 2: " + f1.velocidade);

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();

		System.out.println("Velocidade do carro 1: " + c1.velocidade);
		System.out.println("Velocidade do carro 2: " + f1.velocidade);

	}

}
