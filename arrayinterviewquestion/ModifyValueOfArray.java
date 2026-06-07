package arrayinterviewquestion;

import java.util.Arrays;

public class ModifyValueOfArray {
          public static int[] modifyElement(int[] arr) {
                    arr[0] = 100;
                    arr[1] = 200;
                    arr[2] = 300;
                    return arr;
          }

          public static void main(String[] args) {

                    int arr[] = { 1, 2, 3, 4, 5, 6 };
                    System.out.println("Original array:"+Arrays.toString(arr));
                    ModifyValueOfArray.modifyElement(arr);
                    System.out.println("Modify array: "+Arrays.toString(arr));
          }
}
