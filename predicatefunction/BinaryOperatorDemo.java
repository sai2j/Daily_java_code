package predicatefunction;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 5));

        BinaryOperator<String> concat = (x, y) -> x.toUpperCase() + y.toUpperCase();
        System.out.println(concat.apply("hello", " babu bhai"));
    }
}
