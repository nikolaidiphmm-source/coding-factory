package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

/**
 * Queues are FIFO(First In First Out) logic
 * implement with:
 * enqueue()
 * dequeue()
 */
public class QueueApp {
    static int[] queue = new int[10];
    static int top = -1;

    public static void main(String[] args) {

    }

    public static void enqueue(int val) {
        if (isFull()) {
            throw new RuntimeException("Queue is Full!");
        }
        queue[++top] = val;
    }

    public static int dequeue() {
        int num = queue[0];

        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty!");
        }
        num = queue[0];

        queue = Arrays.copyOfRange(queue, 1, queue.length +1);
        top--;
        return num;
    }
    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == queue.length -1;
    }
}
