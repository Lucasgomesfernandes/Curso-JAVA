package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilter_1 {

	public static void main(String[] args) {
		Celular c0 = new Celular("Iphone", 8000.0, false);
		Celular c1 = new Celular("Iphone", 4000.0, false);
		Celular c2 = new Celular("Xiomi", 1500.0, false);
		Celular c3 = new Celular("Samsung", 3000.0, false);
		Celular c4 = new Celular("Iphone", 3000.0, true);
		Celular c5 = new Celular("Xiomi", 1000.0, true);
		Celular c6 = new Celular("Samsung", 2000.0, true);

		List<Celular> celular = Arrays.asList(c0, c1, c2, c3, c4, c5, c6);
		
		Predicate<Celular> valor = v -> v.preco <= 5000.0;
		Predicate<Celular> usado = u -> !u.usado;
		Function<Celular, String> anuncio = a -> a.marca + " custa R$" + a.preco + " e nao é usado ";
		
		celular.stream()
			.filter(valor)
			.filter(usado)
			.map(anuncio)
			.forEach(System.out::println);
		
	}

}
