package A_fundamentos.basics5;

import java.util.Scanner;

public class Basics5 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Primeiro numero");
		String a = scanner.nextLine();
		int A = Integer.parseInt(a);
	
		System.out.println("Segundo numero");
		String b = scanner.nextLine();
		int B = Integer.parseInt(b);
		
		System.out.println("Operação");
		String op = scanner.next();
		
//		double result = "+".equals(op) ? A + B ?
//						"-".equals(op) ? A - B ?
//						"*".equals(op) ? A * B ?
//						"/".equals(op) ? A / B : 0;
//		
		System.out.printf("%s %s %s", A, op, B);
		
		scanner.close();
	}
}
