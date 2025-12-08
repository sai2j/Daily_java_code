package lambda;

import java.util.Scanner;

interface Length {
    int getLength(String str);
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Length l1 = str -> str.length();

        var name = sc.nextLine();

        System.out.println(l1.getLength(name));

        sc.close();
    }
}