package org.learning.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.add("India");
        queue.add("Germany");
        queue.add("UK");

        System.out.println("Original queue "+queue);

        queue.remove();
        System.out.println("queue after removing the head element "+queue);

        String head = queue.peek();
        System.out.println("Head of queue "+head);

        head = queue.poll();
        System.out.println("Removed head "+head);

        System.out.println("queue now looks like "+queue);
    }
}
