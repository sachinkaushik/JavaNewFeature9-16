package java11demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriterExample {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("./resources/sample.txt");
        String fileContent= Files.readString(file);
        System.out.println(fileContent);
    }
}
