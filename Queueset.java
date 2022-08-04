package org.example.sms;

import java.util.LinkedList;
import java.util.Queue;

public class Queueset {
    public static void main(String[] args) {
        {
            Queue<Integer> q = new LinkedList<>();

            // Adds elements {0, 1, 2, 3, 4} to
            // the queue
            for (int i = 0; i < 5; i++)
                q.add(i);

            // Display contents of the queue.
            System.out.println("Elements of queue " + q);

            // To remove the head of queue.
            int removedelete = q.remove();
            System.out.println("removed element-" + removedelete);

            System.out.println(q);

            // To view the head of queue
            int head = q.peek();
            System.out.println("head of queue-" + head);

            // implementation.
            int size = q.size();
            System.out.println("Size of queue-" + size);
        }
    }
}
