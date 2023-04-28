import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterFlow {
	public static void main(String... args) {
		String textData;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter printer = new PrintWriter(System.out, true);

		printer.println("Digite seu texto que será gravado em arquivo. Digite 'sair' para parar.");

		// true = append | false or empty = overwrite
		try(FileWriter writer = new FileWriter("database.txt", true)) {
			do{
				textData = reader.readLine();
				if (textData.compareTo("sair") == 0) break;
				textData = textData + "\r\n";
				writer.write(textData);
				
			} while(textData.compareTo("sair") != 0);
		} catch(IOException e) {
			printer.println("--> IOException " + e);
		}
	}
}
