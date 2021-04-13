import java.util.ArrayList;
import java.util.List;

public class SafeVarExample {

    public static void main(String[] args) {
        SafeVarExample p = new SafeVarExample();
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");
        p.display(list);
    }

    private void display(List<String>... products) { // Not using @SaveVarargs
        for (List<String> product : products) {
            System.out.println(product);
        }
    }
}
