package B_controle.exercicios;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual o ano? ");
		int ano = scanner.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("Ano Bissexto");
		} else {
			System.out.println("Ano Normal");
		}
		scanner.close();
	}

}
