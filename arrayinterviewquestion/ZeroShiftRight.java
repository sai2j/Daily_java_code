package arrayinterviewquestion;

import java.util.Arrays;

public class ZeroShiftRight {
          public static void main(String[] args) {
                    int arr[] = { 0, 1, 3, 4, 0, 9, 5 };
                    int temp = 0;

                    for(int i=0;i<arr.length;i++){
                              if(arr[i]==0){
                                        for(int j=i+1;j<arr.length;j++){
                                                  if(arr[j]!=0){
                                                            temp = arr[i];
                                                            arr[i]= arr[j];
                                                            arr[j]=temp;
                                                            break;
                                                  }
                                        }
                              }
                    }
                    IO.print(Arrays.toString(arr));

          }
}