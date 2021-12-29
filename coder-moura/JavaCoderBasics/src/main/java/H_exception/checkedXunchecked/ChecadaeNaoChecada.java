package H_exception.checkedXunchecked;

public class ChecadaeNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
				
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void geraErro1() {
		throw new RuntimeException("Runtime Exception - não checada - trata erro se quiser");
	}

	private static void geraErro2() throws Exception {
		throw new Exception("Exception - Checada, requer Try/Catch (tratamento do erro)");
	}
}
