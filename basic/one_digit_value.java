package basic;

public class one_digit_value {
          public static void main(String[] args) {
                    int num = 999;

                    for(int i = 0;num>9;i++){
                              int sum = 0;
                              for(int j = num ;j!=0;j/=10){
                                        sum =sum +(j%10);
                              }
                              num = sum;
                    }
                    System.out.println( num);
          }
          
}
