package arrayinterviewquestion;

public class RemoveDuplicate {
          public static void main(String[] args) {
                    int arr[]={2,4,5,2,2,5,6,1,1};
                    for(int i =0;i<arr.length;i++){
                              for(int j=i+1;j<arr.length;j++){
                                        if(arr[i]==arr[j]){
                                                  arr[j]=-1;       
                                        }
                              }
                    }
                    for(int ele:arr){
                              if(ele!=-1){
                                        System.out.print(ele+" ");
                              }
                    }
          }
}
