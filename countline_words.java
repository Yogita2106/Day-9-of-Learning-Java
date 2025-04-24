import java.io.File;
import java.io.IOException;
import java.util.*;
class countline_words{
    public void countWords(){
        try {
            File file=new File("fileHandle.txt");
            Scanner sc=new Scanner(file);
            int c=0;
            int lineCount=0;
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                lineCount++;
                String[] words=line.split(" ");
                c+=words.length;
            }
            sc.close();
            System.out.println("Total words in file: " + c);
            System.out.println("Total lines in file: " + lineCount);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}