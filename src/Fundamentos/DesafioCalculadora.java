package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//ler dois numeros passados pelo usuario
		//perguntar para o usuarui qual opera��o ele deseja fazer 
		//ex: + - * / % 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite dois numeros para realizar a opera��o: ");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		
		System.out.println("Digite qual opera��o deseja realizar(+ - * / %) ");
		String op = scanner.next();
		
		// Logica
		double resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;
		
 		
		System.out.printf("%.2f %s %.2f = %.2f ", n1, op, n2, resultado);
		
		scanner.close();
		
	}

}
