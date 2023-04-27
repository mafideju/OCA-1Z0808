import java.io.IOException;

public class Main {

	public static void main(String... args) throws IOException {
		byte data[] = new byte[100];
		System.out.println("Letras, quero letras...");
		System.in.read(data);
		System.out.println("Letras oferecidas: ");
		for(int i = 0; i < data.length; i++) {
			System.out.write((char) data[i]);
		}
		System.out.println(data.length);
		System.out.println();
	}

}
