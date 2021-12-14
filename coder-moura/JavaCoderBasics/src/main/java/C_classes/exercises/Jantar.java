package C_classes.exercises;

public class Jantar {

	public static void main(String[] args) {
		Comida arroz = new Comida("Arroz", 0.350);
		Comida feijao = new Comida("Feijão", 0.5);
		Comida batata = new Comida("Batata", 0.6);
		Comida mistura = new Comida("Bife", 0.85);
		Pessoa pessoa = new Pessoa("Marcio", 70.0);
		
		double pesoAtual = pessoa.peso;
		
		pesoAtual = pessoa.comer(arroz);
		pesoAtual = pessoa.comer(feijao);
		pesoAtual = pessoa.comer(batata);
		pesoAtual = pessoa.comer(mistura);
		
		System.out.println(pessoa.nome + " agora pesa " + pesoAtual + " quilos.");
		
		// System.out.printf("%s comeu %s com %s e agora pesa %d quilos", pessoa.nome, arroz.nome, feijao.nome, pessoa.peso);
		
	}
}
