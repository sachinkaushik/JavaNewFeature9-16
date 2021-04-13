package java16demo;

public class RecordCompactConstructorExample {
    record Student(String name, String rollNo){
//      Instead of creating constructor below, we have feature called compact constructor
//        Student(String name, String rollNo){
//            if (rollNo == null)
//                throw new IllegalArgumentException("Roll Number doesn't exist");
//            this.name = name;
//            this.rollNo = rollNo;
//        }

        Student {
            if (rollNo == null)
                throw new IllegalArgumentException("Roll Number doesn't exist");
        }
    }

    public static void main(String[] args) {
        Student s = new Student("john", null);
        System.out.println(s);
    }
}
