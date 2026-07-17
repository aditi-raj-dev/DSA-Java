package OOP.Collections.Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueEmpty {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
