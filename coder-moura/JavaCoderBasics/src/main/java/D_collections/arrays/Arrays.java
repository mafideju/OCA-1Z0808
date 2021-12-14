package D_collections.arrays;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantas notas quer somar? ");
		int totalNotas = scanner.nextInt() - 1;
		
		double nota;
		double total = 0;
		// double[] notas = new double[totalNotas];

		for (int i = 0; i <= totalNotas; i++) {
			System.out.println("Entre a " + (i + 1) + "° nota: ");
			nota = scanner.nextDouble();
			total += nota;
		}
		
		double media = total / (totalNotas + 1);
		
		System.out.println("Foram inseridas " + (totalNotas + 1) + " notas. A media de notas é " + media);
		scanner.close();
	}
}
