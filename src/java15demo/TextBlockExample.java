package java15demo;

public class TextBlockExample {
    public static void main(String[] args) {
        String data = """
                Java 15
                has introduced a
                good feature
                called
                String Text Block..!!!""";
        System.out.println(data);

        String data1 = """
                "Java 15"
                        has introduced a
                good feature
                called
                String Text Block..!!!""";
        System.out.println(data1);

        //String data2 = """not valid""";
    }


}
