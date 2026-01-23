package vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo4 {

          public static void main(String[] args) {

                    long starttime = System.currentTimeMillis();
                    ArrayList<Integer> al = new ArrayList<>();
                    for (int i = 0; i < 1000; i++) {
                              al.add(i);
                    }

                    System.out.println("array list time :");
                    long endtime = System.currentTimeMillis();
                    System.out.println(endtime - starttime);

                    Vector<Integer> v1 = new Vector<>();
                    for (int i = 0; i < 1000; i++) {
                              al.add(i);
                    }
                    System.out.println("vector list time :");
                    System.out.println(endtime - starttime);
          }
}
