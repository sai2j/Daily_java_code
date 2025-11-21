package basic;

public class count {
          public static void main(String[] args) {
                    int num = 12345;

                    int count = 0;

                    for(int i = num ;i!=0;i/=10){
                              count++;
                    }
                    System.out.println(count);
          }
}
