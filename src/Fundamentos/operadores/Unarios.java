package Fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
			
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); 	// operador antes da variavel incrementa antes de comparar
		System.out.println(a == b);			// operador depois da variavel incrementa depois de comparar
		System.out.println(a);
		System.out.println(b);
		
	}

}
