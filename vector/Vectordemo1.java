package vector;

import java.util.Vector;

public class Vectordemo1 {
          public static void main(String[] args) {
                    Vector<Integer> v = new Vector<>(100, 20);
                    System.out.println("vector capicity: " + v.capacity());
                    for (int i = 0; i < 100; i++) {
                              v.add(i);
                    }
                    System.out.println("vector capicity: " + v.capacity());
                    v.add(101);
                    System.out.println("vector capicity: " + v.capacity());
          }
}
