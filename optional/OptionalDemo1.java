package optional;

import java.util.Optional;

public class OptionalDemo1 {
          public static void main(String[] args) {
                    String str = null;
                    Optional<String> op = Optional.ofNullable(str);

                    if(op.isPresent()){
                              System.out.println("value in the container: "+op.get());
                    }
                    else{
                              System.err.println("no value in the container");
                    }

          }
}
