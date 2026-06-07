package arrayinterviewquestion;

public class TwoSumProblem {
          public static void main(String[] args) {
                    int arr[] = { 2, 7, 11, 6, 15, 3 };
                    int target = 9;
                    for (int i = 0; i < arr.length; i++) {
                              for (int j = i + 1; j < arr.length; j++) {
                                        if (arr[i] + arr[j] == target) {
                                                  IO.println(target + " Founf in element " + arr[i] + "," + arr[j]);
                                        }
                              }
                    }
          }
}