package java11demo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChangeInLamdaExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(9,8,6,4,3,2);
        List<Integer> newList = list.stream().map(x -> x * 2).collect(Collectors.toList());

        //Now in java 11, we can use var also
        list.stream().map( (var x) -> x*2).collect(Collectors.toList());

        //we can use Annotation in
        //list.stream().map((@NotNull var x) -> x*2).collect(Collectors.toList());

      //  Predicate<String> predicate = (@Nullable var a) -> true;
    }
}
