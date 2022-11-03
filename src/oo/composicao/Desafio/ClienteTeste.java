package oo.composicao.Desafio;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Maria da Silva");

		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 5, 4);
		compra1.adicionarItem("Notebook", 2000, 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Borracha", 2, 5);
		compra2.adicionarItem(new Produto("Celular", 2000), 1);

		cliente.compras.add(compra1);
		cliente.compras.add(compra2);

		System.out.println(cliente.obterValorTotal());

	}

}
