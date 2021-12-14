package C_classes.miniprojeto;

public class Produto {

	String nome;
	double preco;
	static double descontoGeral = 0.25;
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public Produto() {
		
	}
	
	double precoComDesconto() {
		return preco * (1 - descontoGeral);
	}
	
	double precoComDesconto(double descontoAdd) {
		return preco * (1 - (descontoGeral + (descontoAdd / 100)));
	}
}
