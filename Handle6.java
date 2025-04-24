import java.io.File;
import java.io.IOException;

import java.io.File;
import java.io.IOException;

public class Handle6 {
    public static void main(String[] args) throws IOException {
        File file = new File("project.txt");
        if (file.createNewFile()) {
            System.out.println("File 'project.txt' has been created successfully.");
        } else {
            System.out.println("File 'project.txt' already exists.");
        }
    }
}