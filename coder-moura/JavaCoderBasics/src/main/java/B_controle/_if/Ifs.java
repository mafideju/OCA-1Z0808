package B_controle._if;

import java.util.Scanner;

public class Ifs {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		System.out.print("Informe numero para saber o dia da semana: ");
		
		int indice = entrada.nextInt();
		
		if (indice == 1) {
			System.out.println("Domingo");
		} else if (indice == 2) {
			System.out.println("Segunda");
		} else if (indice == 3) {
			System.out.println("Terça");
		} else if (indice == 4) {
			System.out.println("Quarta");
		} else if (indice == 5) {
			System.out.println("Quinta");
		} else if (indice == 6) {
			System.out.println("Sexta");
		} else if (indice == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Valor não reconhecido");
		}
		
		entrada.close();
	}

}
