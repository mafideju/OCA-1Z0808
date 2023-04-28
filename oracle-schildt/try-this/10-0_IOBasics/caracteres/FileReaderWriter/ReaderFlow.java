import java.io.*;

class FileReaderFlow {
	public static void main(String... args) {
		PrintWriter printer = new PrintWriter(System.out, true);
		String data;
		try(BufferedReader reader = new BufferedReader(new FileReader("programming.txt"))) {
			while((data = reader.readLine()) != null) {
				printer.println(data);
			}
		} catch(IOException e) {
			printer.println(e);
		}
	}
}
