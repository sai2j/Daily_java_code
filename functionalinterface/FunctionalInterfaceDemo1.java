package functionalinterface;
@FunctionalInterface
interface drawable{
void draw();
}

public class FunctionalInterfaceDemo1 {
          public static void main(String[] args) {
                    drawable draw = new drawable() {
                              public void draw(){
                                        System.out.println("drawable method overriding");
                              }
                    };
                    draw.draw();
          }
}
//62