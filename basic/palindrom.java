package basic;

public class palindrom {
          public static void main(String[] args) {
                    int num = 121;
                    int rev = 0;
                    for(int i =num ;i !=0;i/=10){
                              rev = rev*10 + i%10;
                    }
                    if(rev == num){
                     
                              System.out.println("palindrom");
                    }
                    else{
                              System.out.println("not palindrom");
                    }
          }
}
