import java.io.File;
public class file_details{
    public static void main(String[] args){
        File f=new File("fileHandle.txt");
        if(f.exists()){
            System.out.println("File name : " +f.getName());
            System.out.println("File path : " +f.getAbsolutePath());
            System.out.println("File length(in Bytes) : " +f.length());
            System.out.println("File readabel : " +f.canRead());
            System.out.println("File write : " +f.canWrite());
            System.out.println("File delete : " +f.delete());
        }else{
            System.out.println("File not exists");
        }
    }
}