package lambdas;

//interface funcional pode ter apenas um unico metodo;
//criadas para utilizar lambdas;
@FunctionalInterface
public interface Calculo {

	// public abstract fica implicito
	double executar(double a, double b);

	default String legal() {
		return "legal";
	}

	static String muitoLegal() {
		return "muito legal";
	}
}
