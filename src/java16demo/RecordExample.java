package java16demo;

public class RecordExample {

    record Student(String name, String rollNo){}

    public static void main(String[] args) {
        Student s = new Student("John", "JH001");
        Student s1 = new Student("John", "JH001");
        Student s2 = new Student("John1", "JH001");

        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));

        System.out.println(s);
    }
}
