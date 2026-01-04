package array;

public class RemoveElement {
          public static void main(String[] args) {
                    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
                    // 1,2,4,5,6,7
                    for (int i = 0; i < arr.length; i++) {
                              System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    int idx = 2;
                    int n = arr.length;
                    for (int i = idx; i < n - 1; i++) {
                              arr[i] = arr[i + 1];
                    }
                    n--;
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");
                    }
          }
}
