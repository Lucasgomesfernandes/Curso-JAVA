package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {

		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));

		Scanner scanner = new Scanner(System.in);
		
		String s2 = scanner.next();
		
		System.out.println("2" == s2);
		System.out.println("2" == s2.trim()); // trim tira os espa�os em branco da string
		System.out.println("2".equals(s2.trim())); // para comparar strings usar ".equals", pois pega o conteudo dentro da variavel 
		
		scanner.close();
	}

}
