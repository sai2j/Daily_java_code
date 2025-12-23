package exceptionhandling;

public class ThrowableMethod {
          public static void main(String[] args) {
                    try{
                              int arr[] =new int[-10];
                    }
                    catch(Exception e)
                    {
                              System.out.println("Array size must be positive integer");
                              System.out.println(e.toString());
                              System.out.println(e.getMessage());
                              e.printStackTrace();
                    }
          }
}
