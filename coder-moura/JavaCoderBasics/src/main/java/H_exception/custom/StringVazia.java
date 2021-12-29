package H_exception.custom;

@SuppressWarnings("serial")
public class StringVazia extends RuntimeException {

	private String nomeDoAtributo;

	public StringVazia (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está vazio.", nomeDoAtributo);
	}
}
