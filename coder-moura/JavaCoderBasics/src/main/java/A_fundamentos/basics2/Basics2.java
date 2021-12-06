package A_fundamentos.basics2;

import java.util.Scanner;

public class Basics2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1 para Cadastro ou 2 para Somadora");
		String choose = scanner.nextLine();
		int parsedChoice = Integer.parseInt(choose);
		System.out.println(parsedChoice);
		
		
		if (parsedChoice == 1) {
			
			System.out.print("Digite seu nome: ");
			String name = scanner.nextLine();
			System.out.print("Digite seu sobrenome: ");
			String surname = scanner.nextLine();
			System.out.print("Digite sua idade: ");
			String age = scanner.nextLine();
			System.out.print("Digite sua profissão: ");
			String occupation = scanner.nextLine();
			
			System.out.printf("Full Name -> %s %s, %s anos, %s", name, surname, age, occupation);
		
		} else if (parsedChoice == 2) {
			
			System.out.println("Primeiro numero");
			String a = scanner.nextLine();
			int A = Integer.parseInt(a);
		
			System.out.println("Segundo numero");
			String b = scanner.nextLine();
			int B = Integer.parseInt(b);
			
			System.out.println("");
			System.out.printf("O resultado da soma de %d e %d é igual a %d.", A, B, A + B);
			
		}
		
		
		scanner.close();
	}
}
