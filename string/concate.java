package string;

public class concate {
          public static void main(String[] args) {
                    StringBuffer s1 = new StringBuffer("data");
                    s1.append("base");
                    System.out.println(s1); 

                    StringBuilder s2 = new StringBuilder("data");
                    s2.append("base");
                    System.out.println(s2);

                    String s3 = new String("data");
                    String s4 = s3.concat("base");
                    System.out.println(s4);


          }
}
