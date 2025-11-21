package basic;

public class fabonacci {
          public static void main(String[] args) {
                    int num = 10;
                    int a =0;
                    int b=1;
                    System.out.print( 0 +" "+1+" ");
                    for(int i =0;i<num;i++){
                              int c = a+b;
                              a=b;
                              b=c;
                              System.out.print(c+" ");
                    }
          }
}
