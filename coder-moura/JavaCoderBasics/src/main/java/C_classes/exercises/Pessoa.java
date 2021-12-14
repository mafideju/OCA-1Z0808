package C_classes.exercises;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	
	double comer(Comida comida) {
		if (comida != null) {
			System.out.println("Prato do dia: " + comida.nome);
			return this.peso += comida.peso; 
		}
		return peso;
	}
}
