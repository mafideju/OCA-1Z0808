package F_lambdas.basics;

public class Testes {

	public static void main(String[] args) {
//		Calculo soma = new Soma();
//		double conta = soma.executar(6, 5.9);
//		System.out.println(conta);
		
		Calculo soma = (a, b) -> {
			return a + b;
		};
		
		System.out.println(soma.executar(6, 5.9));
	}

}
