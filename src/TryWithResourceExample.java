import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourceExample {

    public static void main(String[] args) throws FileNotFoundException {

        //Prior to java 9 we had to declare and initialize resource in try block
        //parenthesis
        try(FileOutputStream fileStream=new FileOutputStream("sachin.txt");){
            String greeting = "Welcome to Mithu Tech.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }

        FileOutputStream fileStream=new FileOutputStream("sachin.txt");
        try(fileStream){
            String greeting = "Welcome to Mithu Tech.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written with java 9 approach");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
