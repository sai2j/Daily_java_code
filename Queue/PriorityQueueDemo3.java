
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo3 {
          public static void main(String[] args) {
                    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
                    maxheap.add(15);
                    maxheap.add(10);
                    maxheap.add(20);
                    maxheap.add(30);

                    while (!maxheap.isEmpty()) {
                              System.out.println(maxheap.poll());
                    }
          }
}
