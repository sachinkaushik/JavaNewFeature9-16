package java11demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectionChangeExample {
    public static void main(String[] args) {
        var list = List.of("A", "B", "C");
        var copy = List.copyOf(list);
        System.out.println(list == copy);

        var list1 = new ArrayList<String>();
        var copy1 = List.copyOf(list);
        System.out.println(list1 == copy1);   // false


        var map = Map.of("A", 1, "B", 2);
        System.out.println(map);
    }
}
