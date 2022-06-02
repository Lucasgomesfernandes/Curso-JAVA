package Fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "Reprovado"; // if ternario => apos o "?" come�a a condi��o, 
																	// o ":" separa os valores atribuidos
		
		System.out.println("O aluno esta " + resultadoFinal);
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota>= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.println("\nTem desconto? " + resultado);
		
	}

}
