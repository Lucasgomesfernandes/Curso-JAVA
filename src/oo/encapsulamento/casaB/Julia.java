package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcessos() {
		Ana sogra = new Ana();

		// System.out.println(sogra.segredo); // nao da pra ver pois é privado
		// System.out.println(sogra.facoDebtroDeCasa);
		// System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);

	}
}
