package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/* 
		 * 1. Numero para string binaria... 6=> "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
		UnaryOperator<String> inverter = 
				num -> new StringBuilder(num).reverse().toString();
		Function<String, Integer> converter = 
				num -> Integer.parseInt(num, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(converter)
			.forEach(System.out::println);;
	}

}
