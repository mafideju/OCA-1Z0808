package A_fundamentos.basics3;

import java.util.Locale;
import java.util.Scanner;

public class Basics3 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.print("Qual sua renda em Janeiro:");
		String jan = scanner.nextLine().replace(",", ".");
		double JANUARY = Double.parseDouble(jan);
		
		System.out.print("Qual sua renda em Fevereiro:");
		String feb = scanner.nextLine().replace(",", ".");
		double FEBRUARY = Double.parseDouble(feb);
		
		System.out.print("Qual sua renda em Março: ");
		String mar = scanner.nextLine().replace(",", ".");
		double MARCH = Double.parseDouble(mar);
		
		double total = JANUARY + FEBRUARY + MARCH;
		double media = total / 3;
		
		System.out.printf("No primeiro trimestre o total de ganhos é de %.2f.", total);
		System.out.printf("\nNo primeiro trimestre a média de ganhos é de %.2f.", media);

		scanner.close();
	}
}
