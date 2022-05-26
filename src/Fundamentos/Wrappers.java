package Fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		//wrappers sao a versao objeto dos tipos primitivos;
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;  //Integer i = Integer.parseInt("10000") => transforma uma string para int;
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");  //transforma uma string para boolean;
		System.out.println(bo);
 		
		Character c = '#';
		System.out.println(c + "...");
	}

}
