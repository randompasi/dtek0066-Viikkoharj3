package Assignment3;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


   static Function<Integer,Integer> exponentiationbyTwo = number -> number*number;
public  static void  main(String args[]){
    // Osa A
    var list = List.of(1, 2 ,3);
    var virta = list.stream();
    var list2 = List.of(1, 2 ,3);
    var virta2 = list2.stream();
    var union = Stream.concat(virta,virta2);
    var printList = union.collect(Collectors.toList());
    printValue(printList, "A");
    //Osa B
  List<Integer> evenNumbers = printList.stream().map(i -> i*2).filter(i->i%4 != 0).collect(Collectors.toList());
   printValue(evenNumbers, "B");
    Optional<Integer> op = list.stream().max(Integer::compare);
    printValue(op.stream().collect(Collectors.toList()), "C");
    System.out.println("Osa D");
    Function<Integer, Integer> nelioija = new Funktio();
    System.out.println("16 * 16 = " + nelioija.apply(16));
    System.out.println("15 * 15 = " + exponentiationbyTwo.apply(15) ) ;
    var objResult = new Object() {
        Function<Integer,Integer> namelesObject = number -> number*number;
    };
    System.out.println("15 * 15 = " + objResult.namelesObject.apply(14) ) ;
}


static void printValue(List<Integer> list, String part){
    System.out.println("Osa "+part);
    System.out.println("[");
    list.forEach(System.out::println);
    System.out.println("]");
    System.out.println("--------------------------------------");
}


}
