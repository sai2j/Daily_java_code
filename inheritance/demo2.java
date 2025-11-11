package inheritance;
class Employee{
          protected double salary = 7000000;
}
class Developer extends Employee{
protected double salary=900000;
public void getsalaryInfor(){
          System.out.println(super.salary);
          System.err.println(this.salary);
}
}

public class demo2 {
          public static void main(String[] args) {
                    Developer developer = new Developer();
                    developer.getsalaryInfor();
                    }
          
}
