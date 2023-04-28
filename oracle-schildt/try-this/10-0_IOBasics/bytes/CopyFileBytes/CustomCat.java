import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class CustomCat {
    public static void main(String[] args) {
        int bytes;
        FileInputStream input = null;
        FileOutputStream output = null;

        if (args.length != 2) {
            System.out.println("Copiador de arquivos. Uso: java CustomCat source_file destination_file");
            return;
        }

        try {
            input = new FileInputStream(args[0]);
            output = new FileOutputStream(args[1]);

            do {
                bytes = input.read();
                if (bytes != -1) output.write(bytes);
            } while (bytes != -1);

        } catch (IOException e) {
            System.out.println("Erro de IO: " + e);
        } finally {
            try {
                if (input != null) input.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar entrada: " + e);
            }
            try {
                if (output != null) output.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar saída: " + e);
            }
        }
    }
}