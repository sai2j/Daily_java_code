package arrayinterviewquestion;

public class SearchElement {
          public static void main(String[] args) {
                    int arr[] = { 1, 2, 4, 5, 7, 8, 9 };
                    int target = 5;
                    for (int i = 0; i < arr.length; i++) {
                              if (arr[i] == target) {
                                        System.out.println("target element found at " + i + " index");

                              }
                    }
          }
}
