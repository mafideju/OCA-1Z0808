class Doubles {
    public static void main(String[] args) {
        System.out.println("3: Escreva um programa que usa um array para encontrar a média de 10 valor double. Use os 10 valores que quiser.");

	double[] valores = { 23.85, 78.52, 10.25, 45.32, 99.00, 03.56, 75.55, 00.91, 69.51, 51.69, 45.816 };
	double sum = 0;
	double average = 0;

	for(double valor : valores) {
		System.out.println(valor);
		sum = sum + valor;
	}
	average = sum/valores.length;

	System.out.println("A soma é " + sum + ". A média simples é " + average + " para " + valores.length + " itens na lista.");
    }
}
