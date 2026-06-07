package arrayinterviewquestion;

import java.util.Arrays;
//BubbleSort
public class SortedArray {
          public static void main(String[] args) {
                    int arr[] = { 6, 3, 4, 2, 5, 1 };
                    int temp = 0;
                    for (int i = 0; i < arr.length; i++) {
                              for (int j = i + 1; j < arr.length; j++) {
                                        if (arr[i] > arr[j]) {
                                                  temp = arr[i];
                                                  arr[i] = arr[j];
                                                  arr[j] = temp;
                                        }
                              }
                    }
                    IO.print("Array element in ascending order: "+Arrays.toString(arr));
          }
}
