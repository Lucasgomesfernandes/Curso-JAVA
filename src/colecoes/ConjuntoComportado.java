package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

//		Set<String> lista = new HashSet<>(); //nao garante a oredem de inserção
		Set<String> lista = new TreeSet<>(); // garante a oredem de inserção

		lista.add("Ana");
		lista.add("Caio");
		lista.add("Lucas");
		lista.add("Helena");

		for (String candidato : lista) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>(); 

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(50);

		for (int n : nums) {
			System.out.println(n);
		}
	}

}
