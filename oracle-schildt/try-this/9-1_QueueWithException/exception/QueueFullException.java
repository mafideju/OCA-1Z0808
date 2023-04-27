package exception;

import java.lang.Exception;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "QueueFullException - Fila Cheia - Máximo de " + this.size + ".";
    }

}