package overriding;

class RBI {
          protected String ifsccode = "rbi0001";

          public String loan() {
                    return "rbi provide the loan";

          }
}

class SBI extends RBI {
          protected String ifsccode = "sbi0002"; // variable hiding

          public String loan() {
                    return "sbi provide the loan";
          }

}

public class VariableHiding2 {
          public static void main(String[] args) {
                    RBI rbi = new SBI();
                    System.out.println(rbi.ifsccode + " : " + rbi.loan());

          }
}
