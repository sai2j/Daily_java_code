package predicatefunction.consumer;

import java.util.function.Consumer;

record Product(Integer id, String name, Double price) {

}

public class cunsumerfunction {
          public static void main(String[] args) {
                    Consumer<Integer> c1 = num -> System.out.println("Integer object :" + num);
                    c1.accept(12);

                    Consumer<Double> c2 = db1 -> System.out.println("Double object :" + db1);
                    c2.accept(23d);

                    Consumer<String> c3 = str -> System.out.println("Double object :" + str);
                    c3.accept(new String("java"));

                    Consumer<Product> c4 = prod -> System.out.println("Product :" + prod);
                    c4.accept(new Product(1, "laptop", 98000D));

          }
}
