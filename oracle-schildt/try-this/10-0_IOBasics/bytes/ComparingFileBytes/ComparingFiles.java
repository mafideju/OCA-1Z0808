import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class ComparingFiles {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        if (args.length != 2) {
            System.out.println("Comparador de arquivos. Uso: java ComparingFiles file_a file_b");
            return;
        }

        try(FileInputStream fileOne = new FileInputStream(args[0]);
            FileInputStream fileTwo = new FileInputStream(args[1])) {

            do {
                i = fileOne.read();
                j = fileTwo.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j) System.out.println("Arquivos Diferentes!");
            else System.out.println("Match!!! Arquivos Iguais");

        } catch (IOException e) {
            System.out.println("Erro de IO: " + e);
        }
    }
}
