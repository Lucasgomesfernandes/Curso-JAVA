package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seus ultimos 3 salarios: ");
		
		String s1 = scanner.nextLine().replace(",", ".");  //replace troca a "," por "."
		String s2 = scanner.nextLine().replace(",", ".");
		String s3 = scanner.nextLine().replace(",", ".");
		
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		double n3 = Double.parseDouble(s3);
		
		double Soma = n1 + n2 + n3;
		double Media = (Soma / 3);
		
		System.out.println("A soma dos salarios é: " + Soma);
		System.out.println("A media dos salarios é: " + Media);
		
		scanner.close();
	}

}
