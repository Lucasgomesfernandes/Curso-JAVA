package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 * */
		
		Function<Produto, Double> precoFinal = 
				prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				imp -> imp >= 2500 ? imp + imp * 0.085 : imp;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
				
		//O método Math.round() é utilizado em Java para arredondar um 
		//determinado número para seu número inteiro mais próximo. 
		//Como neste artigo, aprenderemos o arredondamento de um double 
		//para 2 casas decimais, a aplicação de Math.round() incluirá (double*100.0)/100.0
				
		UnaryOperator<Double> arredondar = 
				preco -> Math.round(preco*100.0)/100.0;
			//	                   OU
			//	preco -> Double.parseDouble(String.format("%.2f", preco));
				
		Function<Double, String> formatar = 
				preco -> "R$" + String.valueOf(preco).replace(".", ",");
			//						OU
			//	preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é: " + preco);
		
	}

}
