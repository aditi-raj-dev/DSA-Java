package OOP.Collections.Queue;

import java.util.Queue;
import java.util.LinkedList;

public class PollDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Queue: " + queue);
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue: " + queue);

    }
}