package F_lambdas.plus;

import java.util.function.BinaryOperator;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Integer> soma = (a, b) -> { return (a + b) / 2; };
		System.out.println(soma.apply(10, 20));
		
		BinaryOperator<Integer> multiplicacao = (a, b) -> { return a * b; };
		System.out.println(multiplicacao.apply(10, 20));
		
	}

}
