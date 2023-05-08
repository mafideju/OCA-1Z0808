package interfaxe;

import exception.QueueEmptyException;
import exception.QueueFullException;

public interface IQueue {
    void put(char character) throws QueueFullException;
    int get() throws QueueEmptyException;
    String toString();
}