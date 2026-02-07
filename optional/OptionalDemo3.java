package optional;

import java.util.Optional;

public class OptionalDemo3 {
          public static void main(String[] args) {
                    String name = "raj";
                    Optional<String> op = Optional.ofNullable(name);
                    String value = op.orElse("No value is present");
                    IO.println(value);
          }
}
