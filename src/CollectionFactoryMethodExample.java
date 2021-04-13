import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectionFactoryMethodExample {
    public static void main(String[] args) {

        //Prior to Java 9, if suppose we had to have a list of string for just minimum onject
        // we used to in the following way
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaFX");
        list.add("Spring");
        list.add("Hibernate");
        list.add("JSP");
        for(String l : list){
            System.out.println(l);
        }
        System.out.println("-------------Using java 9-----------------------");
        //using java 9 we can do same above in following way
        List<String> list1 = List.of("Java","JavaFX","Spring","Hibernate","JSP","Java","JavaFX","Spring","Hibernate","JSP","Spring Boot");
        list1.forEach(System.out::println);


        // Creating Map Entry
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
        // Creating Map using map entries
        Map<Integer, String> map = Map.ofEntries(e1,e2);
        // Iterating Map
        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
