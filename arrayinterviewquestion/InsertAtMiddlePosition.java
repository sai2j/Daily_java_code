package arrayinterviewquestion;

import java.util.Arrays;

class InsertAtMiddle {
          public static int[] insertMiddlePosition(int[] arr, int element) {
                    int newarray[] = new int[arr.length + 1];
                    int middle = arr.length / 2;

                    for (int i = 0; i < middle; i++) {
                              newarray[i] = arr[i];

                    }
                    newarray[middle] = element;
                    for (int i = middle; i < arr.length; i++) {
                              newarray[i + 1] = arr[i];
                    }
                    return newarray;
          }
}

public class InsertAtMiddlePosition {
          public static void main(String[] args) {
                    int val[] = { 10, 20, 30, 40, 50, 60, 70 };
                    System.out.println("original Array:" + Arrays.toString(val));

                    int ele = 100;

                    int middleposition[] = InsertAtMiddle.insertMiddlePosition(val, ele);
                    System.out.println("Insert Middle Array"+Arrays.toString(middleposition));

          }
}
