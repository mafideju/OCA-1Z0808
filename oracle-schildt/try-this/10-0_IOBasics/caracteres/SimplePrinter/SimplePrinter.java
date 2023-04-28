import java.io.PrintWriter;
import java.io.IOException;

public class SimplePrinter {
	public static void main(String... args) {
		PrintWriter printer = new PrintWriter(System.out, true);
		printer.println("** Console com PrintWriter **");
		Double sicrano = 6.98;
		Double fulano = 14.26;

		printer.println("A soma de " + fulano + " + " + sicrano + " é igual a " + (sicrano + fulano) + ".");

	}
}
