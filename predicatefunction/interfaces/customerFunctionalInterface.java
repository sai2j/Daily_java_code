package predicatefunction.interfaces;

interface myInterface<T,U,V,R>{
          R myApply(T a ,U b,V c,R d);
}
public class customerFunctionalInterface {
          public static void main(String[] args) {
                    myInterface<Integer ,Integer,Integer,String> customerinfo = (a,b,c,d) -> a+b+c+" ";
                    System.out.println(customerinfo.myApply(100, 200, 300,"divide"));
          }
}
