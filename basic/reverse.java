package basic;

public class reverse {
          public static void main(String[] args) {
                    int num = 123;
                    int rev = 0;
                    for(int i = num; i!=0;i/=10){
                              rev =rev*10 + i%10;
                    }
                    System.out.println(rev);
          }
}
