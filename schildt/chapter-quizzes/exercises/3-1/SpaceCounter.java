class SpaceCounter {

	public static void main (String[] args) throws java.io.IOException {
		char userInputs;
		int userInputCount = 0, space = 0;

		System.out.println("Insira um caracter e pressione enter. Contaremos os espaços apenas.");

		do {
			userInputs = (char) System.in.read();
			if (userInputs != '\n') {
				userInputCount++;
			}
			if (userInputs == ' ') {
				space++;
			}
		} while (userInputs != '.');

		System.out.println("Total de entradas => " + userInputCount);
		System.out.println("Espaços => " + space);
		System.out.println("Saiu!");
	}

}
