package arrayinterviewquestion;

import java.util.Arrays;

public class ReverseArray {
          public static void main(String[] args) {
                    int size = Integer.parseInt(IO.readln("Enter the size of the array:"));
                    int[] arr = new int[size];

                    for (int i = 0; i < size; i++) {
                              arr[i] = Integer.parseInt(IO.readln("Array Element:"));

                    }
                    IO.println("original Array:");
                    IO.println(Arrays.toString(arr));
                     IO.println("Reverse Array:");
                    for (int i = arr.length-1; i >= 0; i--) {
                              System.out.print(arr[i]+" ");
                    }

          }
}
