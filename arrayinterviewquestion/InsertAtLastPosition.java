package arrayinterviewquestion;

import java.util.Arrays;

class InsertLast {
          public static int[] InsertAtlast(int arr[], int element) {
                    int newarray[] = new int[arr.length + 1];
                    for (int i = 0; i < arr.length; i++) {
                              newarray[i] = arr[i];
                    }
                    newarray[newarray.length - 1] = element;

                    return newarray;
          }
}
public class InsertAtLastPosition {

          public static void main(String[] args) {
                    int[] val = { 10, 20, 30, 40 };
                    int element = 50;
                    val = InsertLast.InsertAtlast(val, element);
                    System.out.println("After inserting Array" + Arrays.toString(val));
          }
}
