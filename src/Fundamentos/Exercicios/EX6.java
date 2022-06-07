package Fundamentos.Exercicios;

public class EX6 {

	public static void main(String[] args) {
		// Criar um programa que resolva equações do segundo grau (ax2+bx+c) utilizando a formula de bhaskara.
		//use como exemplo a=1, b=12, c=-13. Encontre o delta;
		
		double a = 1, b = 12, c = -13;
		
		double delta = Math.pow(b, 2) - (4*a*c);
		double x1 = (-b + Math.sqrt(delta))/2*a; 
		double x2 = (-b - Math.sqrt(delta))/2*a; 
		
		System.out.printf("\nO resultado foi: %.2f e %.2f", x1, x2);
		System.out.printf("\nO valor de delta é: %.2f", delta);
		
	}

}
