package H_exception.custom;

@SuppressWarnings("serial")
public class RuntimeNonCheckedExceptionNegativeNumber extends RuntimeException {

	private String nomeDoAtributo;

	public RuntimeNonCheckedExceptionNegativeNumber(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está negativo.", nomeDoAtributo);
	}
}
