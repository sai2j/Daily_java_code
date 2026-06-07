package arrayinterviewquestion;

import java.util.Arrays;

class Merger {
          public static int[] mergerELementOfTwoArray(int[] x, int[] y) {
                    int newArray[] = new int[x.length + y.length];

                    int position = 0;
                    for (int element : x) {
                              newArray[position] = element;
                              position++;
                    }
                    for (int element : y) {
                              newArray[position] = element;
                              position++;
                    }
                    return newArray;
          }
}

public class MergeTwoArray {
          public static void main(String[] args) {
                    int x[] = { 10, 20, 30 };
                    int y[] = { 40, 50, 60 };

                    int[] ElementOfTWoArray = Merger.mergerELementOfTwoArray(x, y);
                    System.out.println("After merging both the array : "+Arrays.toString(ElementOfTWoArray));

          }
}
