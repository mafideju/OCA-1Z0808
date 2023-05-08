import implementation.Queue;
import interfaxe.IQueue;
import exception.QueueEmptyException;
import exception.QueueFullException;

public class Main {
    public static void main(String... args) throws Exception {
        try {
            System.out.println("Start Queueing...");
            Queue myQueue = new Queue(2);
            myQueue.put('a');
            //myQueue.put('c');
            System.out.println("Minha fila - " + myQueue);

            Queue bookQueue = new Queue(26);
            for(int i = 0; i < 26; i++) {
                char ch = (char) ('A' + i);
                bookQueue.put(ch);
            }
            System.out.println("Fila Alpha - " + bookQueue);
        } catch (Exception e) {
            throw new Exception(e);
        }

        try {
            Queue empty = new Queue(10);
            // empty.get();
            System.out.println("Fila Teste " + empty);
            empty.put('1');
            empty.put('Z');
            empty.put('@');
            System.out.println("Fila Teste " + empty);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}