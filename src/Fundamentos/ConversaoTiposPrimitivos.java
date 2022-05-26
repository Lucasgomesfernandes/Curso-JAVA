package Fundamentos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {

		double a = 1.12345678888888;  //conversao implicita;
		System.out.println(a);
		
		float b = (float) 1.12345678888888;   //conversao explicita (CAST);
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;  //conversao explicita (CAST);
		System.out.println(d);
		
		double e = 1.999999999999;//conversao explicita (CAST);
		int f = (int) e;
		System.out.println(f);
		
	}

}
