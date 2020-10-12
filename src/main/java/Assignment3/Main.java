package Assignment3;

import java.util.List;
import java.util.stream.Stream;

public class Main {

public  static void  main(String args[]){
    // Osa A
    var list = List.of(1, 2 ,3);
    var virta = list.stream();
    var list2 = List.of(1, 2 ,3);
    var virta2 = list.stream();
    var yhdistelmä = Stream.concat(virta,virta2);
    System.out.println("Osa A");
    System.out.print("[");
    yhdistelmä.forEach(element -> System.out.print(element+", "));
    System.out.println("]");
    System.out.println("--------------------------------------");
    //Osa B



}


}
