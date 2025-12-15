package sealedclass;

sealed class Bird permits Parrot,Sparrow{
          public void fly(){
                    System.out.println("bird fly");
          }
} 
non-sealed class Parrot extends Bird{
    public void fly(){
                    System.out.println("parrot fly");
          }
}
non-sealed class Sparrow extends Bird{
          public void fly(){
                    System.out.println("Sparrow fly");
          }
}
public class SealedDemo1 {
          public static void main(String[] args) {
                    Bird bird = null;
                    bird = new Parrot();
                    bird.fly();
                    bird = new Sparrow();
                    bird.fly();
          }
}
