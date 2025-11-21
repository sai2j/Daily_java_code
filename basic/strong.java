package basic;

public class strong {
          public static void main(String[] args) {
                    int num = 145;
                    int sum =0;
                    for(int i = num ;i!=0;i/=10){
                              int x = i%10;
                              int fact = 1;
                              for(int j=x;j>=1;j--){
                                        fact = fact*j;

                              }
                              sum = sum +fact;
                    }
                    if(sum == num){
                              System.out.println("strong");
                    }
                    else{
                              System.out.println("not strong");
                    }
          }
}
