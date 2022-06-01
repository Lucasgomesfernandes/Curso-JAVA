package Fundamentos.operadores;

public class Atribuição {

	public static void main(String[] args) {

		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // ou c = c + b;
		c -= a; // ou c = c - a;
		c *= b; // ou c = c * b;
		c /= a; // ou c = c / a;
		System.out.println(c);
		
		c %= 2; // ou c = c % 2; resultado sera 0 ou 1;
		System.out.println(c);
		
		c++; // c = c + 1;
		c--; // c = c - 1;
	}

}
