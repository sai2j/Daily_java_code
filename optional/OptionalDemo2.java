package optional;

import java.util.Optional;

public class OptionalDemo2 {
          public static void main(String[] args) {
                    Integer roll= null;
                    Optional<Integer> op= Optional.ofNullable(roll);
                    IO.print("Value in the container : "+op.get());
          }
}
