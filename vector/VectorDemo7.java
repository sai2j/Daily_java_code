package vector;
import java.util.*;
record Player(Integer id,String name,Double basePrice){

}
class IplAuction{
          private String iplTeam;
          private Vector<Player> listofPlayer;

          public IplAuction(String iplTeam){
                    this.iplTeam=iplTeam;
                    listofPlayer = new Vector<>();
          }
          public void add(Player player){
                    listofPlayer.add(player);

          }
          public void RetainonRelation(){
                    Iterator<Player> iterator = listofPlayer.iterator();
                    while (iterator.hasNext()) {
                              Player player = iterator.next();
                              if(player.basePrice() >5000){
                                        iterator.remove();
                              }
                    }
          }
          public void displayall(){
                    for(Player player :listofPlayer){
                              System.out.println(player);
                    }
          }
}
class VectorDemo7{
          public static void main(String[] args) {
                  IplAuction ipl = new IplAuction("srh");
                  ipl.add(new Player(101, "rohit", 5000d));
                  ipl.add(new Player(102, "virat", 4500d));
                  ipl.RetainonRelation();
                  ipl.displayall();

          }
}