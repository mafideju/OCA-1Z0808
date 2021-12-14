package C_classes.basics;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	public Data() {
		
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	void obterDataFormatada() {
		System.out.printf("Hoje é dia %s/%s/%s", dia, mes, ano);
		System.out.println();
	}
}
