package java10demo;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorChangeExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,6,4,8,9,5);

        List<Integer> newList = list.stream().filter(i -> i > 4).collect(Collectors.toList());

        //Here we can add in new filtered list, but now java 10 onwards we have unmodifiable list
        // so that no body can change the new filtered list
        newList.add(2);
        newList.forEach(System.out::println);
        List<Integer> newList1 = list.stream().filter(i -> i > 4).collect(Collectors.toUnmodifiableList());
        newList1.add(4); // here we will get java.lang.UnsupportedOperationException
        newList1.forEach(System.out::println);
    }
}
