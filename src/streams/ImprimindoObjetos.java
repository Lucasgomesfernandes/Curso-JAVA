package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana");

		/*
		 * for (int i = 0; i < aprovados.size(); i++) {
		 * System.out.println(aprovados.get(i)); }
		 */ // OU

		System.out.println("Usando o forEach...");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		//Iterator = verifica se tem proximo elemento, se nao tiver para
		System.out.println("Usando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Sequencia de dados que acontece internamente
		System.out.println("Usanod Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //Laço interno!!!

	}

}
