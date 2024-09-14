//Used for concept of First in First out (FIFO)
import java.util.*;

public class MyArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.remove();
        queue.addLast(8);
        // queue.poll();// same has remove
        // queue.offer(2);//same has add 
        System.out.println(queue);
        System.out.println(queue.peek());// since its first in first out
    }
}