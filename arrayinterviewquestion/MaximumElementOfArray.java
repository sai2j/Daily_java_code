package arrayinterviewquestion;

import java.util.Arrays;

public class MaximumElementOfArray {
          public static void maxvalue(int arr[]) {
                    int max = arr[0];
                    for (int ele : arr) {
                              if (ele > max) {
                                        max = ele;
                              }
                    }
                    IO.print("Maximum element in the array is : " + max);

          }

          public static void main(String[] args) {
                    int arr[] = { 1, 2, 3, 4, 5, 6 };
                    System.out.println("Original Array:" + Arrays.toString(arr));
                    MaximumElementOfArray.maxvalue(arr);
          }
}
