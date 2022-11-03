package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();

	void testeAcessos() {
		//System.out.println(esposa.segredo); //nao da pra ver pois é privado
		System.out.println(esposa.facoDebtroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}
