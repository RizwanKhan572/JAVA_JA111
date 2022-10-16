import java.util.LinkedList;
import java.util.Queue;

public class Queue_5 {
    public static void main(String[] args) {
        //fifo
        Queue<Integer> q = new LinkedList<>();

        q.add(2);
        q.add(4);
        q.add(6);

        System.out.println(q.remove());  // first element will be removed due to fifo
        q.peek();    // return first element from the queue.
        System.out.println(q.poll());   // print 1st item.

    }
}
