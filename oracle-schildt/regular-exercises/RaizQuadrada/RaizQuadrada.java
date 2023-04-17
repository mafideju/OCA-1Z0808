import java.util.Scanner;

class RaizQuadrada {
	public static void main(String[] args) throws java.io.IOException {

		Scanner entrada;
		int i;
		do {
			System.out.println("Quadrado de quê?: ");
			entrada = new Scanner(System.in);
			i = entrada.nextInt();
			int saida = i * i;
			System.out.println("Quadrado: " + saida);
		} while (i != 9);


	}
}
