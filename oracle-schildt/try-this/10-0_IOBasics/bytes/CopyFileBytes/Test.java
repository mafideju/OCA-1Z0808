import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class CustomCatResources {
    public static void main(String[] args) {
        int bytes;

        if (args.length != 2) {
            System.out.println("Copiador de arquivos. Uso: java CustomCat source_file destination_file");
            return;
        }

        try(FileInputStream input = new FileInputStream(args[0]);
                FileOutputStream output = new FileOutputStream(args[1])) {

            do {
                bytes = input.read();
                if (bytes != -1) output.write(bytes);
            } while (bytes != -1);

        } catch (IOException e) {
            System.out.println("Erro de IO: " + e);
        }
    }
}