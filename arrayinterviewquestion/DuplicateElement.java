package arrayinterviewquestion;

import java.util.Arrays;
import java.util.HashSet;

/* 
public class DuplicateElement {
          public static void main(String[] args) {
                    int arr[] = { 1, 2, 4, 5, 2, 5, 7, 8 };
                    for (int i = 0; i < arr.length; i++) {
                              for(int j=i+1;j<arr.length;j++){
                                        if(arr[i]==arr[j]){
                                                  System.out.println("Duplicate Element is: "+arr[j]);
                                        }
                              }
                    }
          }
}
*/
public class DuplicateElement {
          public static void main(String[] args) {
                    int arr[] = { 1, 2, 4, 5, 2, 5, 7, 8 };
                    HashSet<Integer> original = new HashSet<>();
                    HashSet<Integer> duplicate = new HashSet<>();

                    for (int ele : arr) {
                              if (!original.add(ele)) {
                                        duplicate.add(ele);
                              }
                    }
                    System.out.println("Duplicate element is: " + duplicate);
                    Object[] array = duplicate.toArray();
                    System.err.println("Duplicate Element through array:" + Arrays.toString(array));

          }
}
