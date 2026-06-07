package arrayinterviewquestion;

import java.util.Arrays;

public class MinimumElementOfArray {
          public static void minValue(int arr[]){
                    int min=arr[0];
                    for(int ele:arr){
                              if(ele<min){
                                        min=ele;
                              }
                    }
                    IO.println("Minimum element in the array is : "+min);
          }
          public static void main(String[] args) {
                    int arr[]={1,2,3,4,5,6};
                    IO.println("Original Array:"+Arrays.toString(arr));
                    MinimumElementOfArray.minValue(arr);
          }
          
}
