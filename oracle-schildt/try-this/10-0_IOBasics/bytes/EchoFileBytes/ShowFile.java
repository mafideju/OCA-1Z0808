import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShowFile {

	public static void main(String... args) throws Exception {
		int i;
		FileInputStream inputFile;

		if (args.length != 1) {
			System.out.println("Como usar? Digite: 'java ShowFile nome-do-arquivo'");
			return;
		}

		try {
			inputFile = new FileInputStream(args[0]);
		} catch(FileNotFoundException exception) {
			System.out.println("*********** File Not Found *************");
			throw new FileNotFoundException();
		}

		try {
			do {
				i = inputFile.read();
				if (i != -1) {
					System.out.print((char) i);
				}
			} while(i != -1);
		} catch (IOException exception) {
			System.out.println("+++++++++ Erro lendo arquivo +++++++++");
		} finally {
			try {
				inputFile.close();
			} catch(IOException exception) {
				System.out.println("####### Erro ao fechar o arquivo ########");
			}
		}

	}
}
