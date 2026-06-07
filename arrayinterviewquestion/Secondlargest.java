package arrayinterviewquestion;

import java.util.Arrays;

// public class Secondlargest {
//           public static void main(String[] args) {
//                     int arr[] = { 10, 20, 30, 40, 50 };
//                     int temp = 0;
//                     for (int i = 0; i < arr.length; i++) {
//                               for (int j = i + 1; j < arr.length; j++) {
//                                         if (arr[i] < arr[j]) {
//                                                   temp = arr[i];
//                                                   arr[i] = arr[j];
//                                                   arr[j] = temp;
//                                         }
//                               }
//                     }
//                     IO.print("Second largest elememnt: "+arr[1]);
//           }
// }

// public class Secondlargest {
//           public static void main(String[] args) {
//                     int[] arr = { 12, 90, 56, 34, 77, 77, 90, 90 };
//                     int temp = 0;
//                     for (int i = 0; i < arr.length; i++) {
//                               for (int j = i + 1; j < arr.length; j++) {
//                                         if (arr[i] > arr[j]) {
//                                                   temp = arr[i];
//                                                   arr[i] = arr[j];
//                                                   arr[j] = temp;
//                                         }
//                               }
//                     }
//                     int largest = arr[arr.length - 1];
//                     int secondlargest = -1;
//                     for (int i = arr.length - 2; i >= 0; i--) {
//                               if (arr[i] != largest) {
//                                         secondlargest = arr[i];
//                                         break;
//                               }
//                     }
//                     IO.print("secondlargest element is :" + secondlargest);
//           }
// }

class Secondlargests {
          public static void main(String[] args) {
                    int arr[] = { 12, 90, 56, 34, 77, 90, 90 };
                    Arrays.stream(arr).distinct().boxed().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().ifPresent(IO::println);
          }
}
