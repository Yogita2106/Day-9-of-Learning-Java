import java.awt.im.InputContext;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
class fileCreate{
    public void create() {
        File file=new File("fileHandle.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File has been created");
            }else{
                System.out.println("Already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class fileWrite{
    public void write() {
        try {
            FileWriter fw=new FileWriter("fileHandle.txt");
            fw.write("I am yashika soni");
            fw.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
class fileRead{
    public void read(){
        try {
            File fr=new File("fileHandle.txt");
            Scanner sc=new Scanner(fr);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
class fileDelete{
    public void delete(){
        File fd=new File("fileHandle.txt");
        if(fd.delete()){
            System.out.println("Deleted"+fd.getName());
        }else{
            System.out.println("Some error occured");
        }
    }
}
class fileAppend {
    public void append() {
        try {
            // Open FileWriter in append mode (second parameter is true)
            FileWriter fw = new FileWriter("fileHandle.txt", true);
            fw.write("I am yashika soni\n"); // Append data to the file
            fw.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
class fileWordCount{
    public void countWords(){
        try {
            File file=new File("fileHandle.txt");
            Scanner sc=new Scanner(file);
            int c=0;
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                String[] words=line.split(" ");
                c+=words.length;
            }
            sc.close();
            System.out.println("Total words in file: " + c);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
public class FileHandlingExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch='y';
        do { 
            System.out.println("1.Create file\n2.Write file\n3.Read file\n4.Delete file\n5.Append file\n6.Word count\n");
        int x=input.nextInt();
        if(x==1){
            fileCreate fc=new fileCreate();
            fc.create();
        }
        if(x==2){
            fileWrite fw=new fileWrite();
            fw.write();
        }
        if(x==3){
            fileRead fr=new fileRead();
            fr.read();
        }
        if(x==4){
            fileDelete fd=new fileDelete();
            fd.delete();
        }
        if(x==5){
            fileAppend fap=new fileAppend();
            fap.append();
        }
        if(x==6){
            fileWordCount fwc=new fileWordCount();
            fwc.countWords();
        }
        System.out.println("Do you want to continue? (y/n)");
        ch=input.next().charAt(0);
        } while (ch!='n');
        
        
    }
}