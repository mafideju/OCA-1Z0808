package B_controle.exercicios;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre um numero! ");
		int valor = scanner.nextInt();
		
		if (valor <= 10 && valor >= 0) {
			System.out.print("Valor Válido. ");
			if (valor % 2 == 0) {
				System.out.println("Numero Par!");
			} else {
				System.out.println("Numero Impar!");
			}
		} else {
			System.out.println("Valor deve estar entr 0 e 10. Valor digitado: " + valor);
		}
		
		scanner.close();

	}

}
