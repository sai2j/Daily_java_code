package overriding;

class bird {
          public void sleep() {
                    System.out.println("genreic bird");
          }
}

class hen extends bird {
          public void sleep() {
                    System.out.println("hen is sleeping");
          }

}

class chick extends bird {
          public void sleep() {
                    System.out.println("chick is sleeping");
          }

}

public class demo3 {
          public static void main(String[] args) {
                    bird b1 = new chick();
                    b1.sleep();
          }

}
