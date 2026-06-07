package arrayinterviewquestion;

public class UniqueElement {
          public static void main(String[] args) {
                    int arr[] = { 10, 20, 30, 40, 20, 10 };

                    for (int i = 0; i < arr.length; i++) {
                              Boolean isUnique = true;
                              for (int j = 0; j < arr.length; j++) {
                                        if (i!=j && arr[i] == arr[j]) {
                                                  isUnique = false;
                                                  break;
                                        }
                              }
                              if(isUnique){
                                        IO.println("Unique element are: "+arr[i]);
                              }
                    }
                    
          }
}
