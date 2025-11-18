class Singleton {
  private static Singleton instance;// null--->100x

  static {
    instance = new Singleton();
    System.out.println("Static Block: Singleton Instance Created");// --->2
  }

  private Singleton() {
    System.out.println("Constructor: Singleton Object Created");// ---1
  }

  public static Singleton getInstance() {
    return instance;
  }

  public void greet() {
    System.out.println("Hello Everyone!!!");// --->3
  }
}

public class pattern {
  public static void main(String[] args) {
    System.out.println("Main Method");
    Singleton obj1 = Singleton.getInstance();// 100x
    obj1.greet();
  }
}