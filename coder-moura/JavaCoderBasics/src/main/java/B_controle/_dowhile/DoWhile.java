package B_controle._dowhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int totalNotas = 1;
		double nota = 0.0;
		double total = 0.0;
		
		while (nota != -1) {
			System.out.printf("Entre a %d° nota da turma: ", totalNotas);
			nota = scanner.nextDouble();
			if (nota >= 0 && nota <= 10) {
				total = total + nota;
				totalNotas++;
			} else {
				System.out.println("Valor Inválido");
			}
		}
		
		double media = total / totalNotas;
		System.out.println("Total de Notas: " + totalNotas);
		System.out.println("Media: " + media);

		scanner.close();
		
	}

}