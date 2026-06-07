package basicInterviewquestion;

public class removezero {
          public static void main(String[] args) {

        int num = 10204;
        int result = 0, place = 1;

        while (num > 0) {
            int digit = num % 10;

            if (digit != 0) {
                result = result + digit * place;
                place = place * 10;
            }

            num = num / 10;
        }

        System.out.println("Result = " + result);
    } 
}
