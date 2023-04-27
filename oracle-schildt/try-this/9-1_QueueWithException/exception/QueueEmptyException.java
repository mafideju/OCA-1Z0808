package exception;

import java.lang.Exception;

public class QueueEmptyException extends Exception {

    public String toString() {
        return "QueueEmptyException - Fila Vazia";
    }

}