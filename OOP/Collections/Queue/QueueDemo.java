package OOP.Collections.Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Queue: " + queue);
    }
}
