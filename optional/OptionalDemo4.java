package optional;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo4 {
          public static void main(String[] args) {
                    ArrayList<Optional<String>> listofcity = new ArrayList<>();
                    listofcity.add(Optional.of("pune"));
                    listofcity.add(Optional.of("mumbail"));
                    listofcity.add(Optional.empty());

                    for(Optional<String> city: listofcity){
                              if(city.isPresent()){
                                        IO.println("City name is :"+city.get());
                              }
                              else{
                                        IO.println("No value in the container");
                              }
                    }

          }
}
