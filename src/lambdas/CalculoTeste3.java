package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {

		// site com fun��es do java
		// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		
		// N�O: int -> Double => ex: Double a = 1;
		// SIM: double -> Double => ex: Double a = 1.0;

		BinaryOperator<Double> calc = (x, y) -> { return x + y;	};
		System.out.println(calc.apply(2.0, 3.0));

		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y;	};
		System.out.println(calc2.apply(2, 3));
		
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
	}
}
