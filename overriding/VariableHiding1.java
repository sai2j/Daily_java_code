package overriding;
class vehicle{
          public int tankcapacity(){
                    return 30;
          }
          public void printtankcapacity(){
                    System.out.println(this.tankcapacity());
          }

}
class car extends vehicle{
          public int tankcapacity(){
                    return 40;
          }
          public void printtankcapacity(){
                    System.out.println(super.tankcapacity());
          }

}
public class VariableHiding1 {
          public static void main(String[] args) {
                    vehicle v1 = new vehicle();
                    v1.printtankcapacity();
          }
}
