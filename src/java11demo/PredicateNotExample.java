package java11demo;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,5,7,8,4,19);

        Predicate<Integer> predicate = n -> n%2==0;
        //list.stream().filter(predicate).forEach(System.out::println);
        //if we want to use same predicate for odd then we can use negate method of
        //Predicate
        list.stream().filter(predicate.negate()).forEach(System.out::println);

        //But if we are using method reference then we can not use negate method
        //here we can not use negate method
        list.stream().filter(PredicateNotExample::isEven).forEach(System.out::println);

        //like here we can use not method of predicate if we are using method reference
        list.stream().filter(Predicate.not(PredicateNotExample::isEven)).forEach(System.out::println);
    }

    public static boolean isEven(Integer n){
        return n%2==0;
    }
}
