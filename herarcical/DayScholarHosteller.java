
import java.util.Scanner;
public class DayScholarHosteller{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int choice = Integer.parseInt(sc.next());
 if( choice>=3){
 System.out.println("Invalid Choice!");
 System.exit(0);
 }
 switch(choice){
 case 1->{
 int id = Integer.parseInt(sc.next());
 String name = sc.next();
 double examFee = Double.parseDouble(sc.next());
 double transportFee = Double.parseDouble(sc.next());
 double amount=Double.parseDouble(sc.next());
 if(amount<=0){
 System.out.println("amount should be Positive.");
 System.exit(0);
 }
 DayScholar scollar = new DayScholar(transportFee,id,name,examFee);
 System.out.println(scollar.displaydetail1());
 scollar.payfee(amount);
 }
 case 2->{
 int id = Integer.parseInt(sc.next());
 String name 
class employee{
          
}
class permanentemployee extends employee{
          
}
class contractemployee extends employee{
          
}
public class employeeSystem {
          
}
