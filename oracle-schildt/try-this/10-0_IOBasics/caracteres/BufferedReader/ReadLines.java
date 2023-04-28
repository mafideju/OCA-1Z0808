import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ReadLines {

	public static void main(String... args) throws IOException{

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String incomingString;

		System.out.println("Entre uma linha de texto e a veja ecoar.. ");
		System.out.println("Use a palavra 'pare' para sair da aplicação.");

		do {
			incomingString = buffer.readLine();
			System.out.println(incomingString);
		} while(!incomingString.equals("pare"));

	}

}
