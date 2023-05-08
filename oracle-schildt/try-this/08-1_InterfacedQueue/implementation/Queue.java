package implementation;
import interfacex.IQueue;

public class Queue implements IQueue {

    private int[] queue;
    private char putData, getData = 0;

    public Queue(int size) {
        queue = new int[size];
    }

    public Queue(Queue objectOfItself) {
        putData = objectOfItself.putData;
        getData = objectOfItself.getData;
        queue = new int[objectOfItself.queue.length];

        for (int i = getData; i < putData; i++) {
            queue[i] = objectOfItself.queue[i];
        }
    }

    public Queue(char[] charArray) {
        putData = 0;
        getData = 0;
        queue = new int[charArray.length];

        for (int pos = 0; pos < charArray.length; pos++) {
            put(charArray[pos]);
        }
    }

    public void put(char character) {
        if(putData == queue.length) {
            System.out.println(" - Fila Cheia!");
            return;
        }

        queue[putData++] = character;
    }

    public int get() {
        if (getData == putData) {
            System.out.println(" - Fila Vazia...");
            return (char) 0;
        }
        return queue[getData++];
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[[ ");
        for (int i = getData; i < putData; i++) {
            sb.append((char) queue[i]);
            if (i < putData - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]]");
        return sb.toString();
    }

    public void printHello() {
        System.out.println("Hello!");
    }

    public double returnSumming() {
        double sum = 2.4 + 3.61;
        System.out.println(sum);
        return sum;
    }
}
