package exceptionhandling;

public class TryCatchWithReturn2 {
          public static void main(String[] args) {
                    System.out.println(returnValue());
          }
          public static int returnValue(){
                    try{
                              return 1/0;

                    }
                    catch(Exception e){
                              return 200;
                    }
          }
}
