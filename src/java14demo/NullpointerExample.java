package java14demo;

class External{
    public String name = null;
}

public class NullpointerExample {
    public static void main(String[] args) {
        External e = new External();

        e.name.isBlank();

        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "e.name" is null
        //at java14demo.NullpointerExample.main(NullpointerExample.java:11)
    }
}
