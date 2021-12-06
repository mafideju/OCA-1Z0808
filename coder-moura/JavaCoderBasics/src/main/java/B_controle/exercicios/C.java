package B_controle.exercicios;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int maior = 0;
		int contador = 0;

		do {
			System.out.println("Digite um numero: ");
			int valor = scanner.nextInt();

			if (valor > maior) maior = valor;

			contador++;
			
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maior);
		scanner.close();

	}

}
