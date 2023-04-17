import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;


public class DataStructs {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Aranha");
        set.add("Macaco");
        set.add("Macaco");
        set.add("Gato");
        set.add("Cachorro");
        System.out.println(set);
        set.forEach(System.out::println);

        Queue<String> queue = new PriorityQueue<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
