package predicatefunction.supplier;

import java.util.function.Supplier;

record Player(Integer id, String name) {

}

public class SupplerDemo2 {
          public static void main(String[] args) {
                    Supplier<Player> s1 = () -> new Player(101, "ravishankar");
                    Player player = s1.get();
                    IO.print(player);
          }
}
