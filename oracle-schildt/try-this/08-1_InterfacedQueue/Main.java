import implementation.Queue;
import interfacex.IQueue;

public class Main {
    public static void main(String... args) {
        System.out.println("Start Queueing...");
        Queue myQueue = new Queue(2);
        myQueue.put('a');
        myQueue.put('c');
        System.out.println("Minha fila - " + myQueue);

        Queue bookQueue = new Queue(30);
        for(int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            bookQueue.put(ch);
        }
        System.out.println("Alpha Line - " + bookQueue);

        Queue empty = new Queue(10);
        empty.get();
        System.out.println("Fila Vazia " + empty);

        Queue random = new Queue(10);
        for(int i = 9; i >= 0; i--) {
            // System.out.println(java.math.Math.random());
            random.put((char) ('0' + i));
        }
        System.out.println("Fila Aleatória - " + random);

        System.out.println(random.returnSumming());
    }
}