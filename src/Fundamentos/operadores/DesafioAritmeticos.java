package Fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {

	/*	int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);   //utilizei CAST para deixar o resultado como inteiro, ja que o Math.pow retorna double
										//a função Math.pow faz o primeiro numero elevado pelo segundo 
		System.out.println(a);
		System.out.println(b);     */
		
		//DESAFIO
		
		double numA, numB, denA, NUM, DEN, RESULTADO;
		
		numA = Math.pow((6 * (3 + 2)), 2);
		denA = 3 * 2;
		numB = Math.pow(((1 - 5) * (2 - 7)/2), 2);
		NUM = Math.pow(numA/denA - numB,3) ;
		DEN = Math.pow(10,3);
		RESULTADO = NUM / DEN;
		
		
		System.out.println(RESULTADO);
		
	}

}
