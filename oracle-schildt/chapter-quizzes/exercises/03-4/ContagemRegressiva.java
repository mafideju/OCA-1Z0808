import java.util.Scanner;

class ContagemRegressiva {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entre um numero: ");
		int number = scanner.nextInt();
		System.out.println("Você escolheu " + number);

		for (int i = number; i >= 0; i = i - 2) {
			System.out.println(i);
			if ((number / 2) + 1  == i) {
				System.out.println("**********************************************************************************");
				System.out.println("**********************************************************************************");
				System.out.println("**********************************************************************************");
				System.out.println("**********************************************************************************");
				System.out.println("**********************************************************************************");
				System.out.println("**********************************************************************************");
				System.out.println("**********************************************************************************");
			}
		}
	}
}

