package array;

public class hello {

   public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 5, 6 };
      int second = Integer.MIN_VALUE;
      int large = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
         if (large < arr[i]) {
            second = large;
            large = arr[i];
         }
      }
      System.out.println(large);
      System.out.println(second);
   }
}
