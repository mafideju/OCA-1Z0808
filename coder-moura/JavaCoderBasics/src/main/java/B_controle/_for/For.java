package B_controle._for;

public class For {

	public static void main(String[] args) {

		for (String i = "#"; !i.equalsIgnoreCase("######"); i = i + "#") {
			System.out.println("Indice " + i);
		}
		
	}
}