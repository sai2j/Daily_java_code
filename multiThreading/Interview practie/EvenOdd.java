public class main{
  public static void main(String[] args) throws InterruptedException{
        Even e1 = new Even();
        Odd o1 = new Odd();
        
        e1.start();
        e1.join();
        o1.start();
    }
}

class Even extends Thread {
    public void run(){
        for(int i=2;i<=10;i+=2){
            System.out.println("Even: "+i);
        }
    }
}
class Odd extends Thread{
    public void run(){
        for(int i=1;i<=10;i+=2){
            System.out.println("Odd: "+i);
        }
    }
}