import java.io.File;
import java.io.IOException;

public class fileInfo {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\ujjwa\\Desktop\\lc.txt"); // I will created already file lc.txt
        if (f.exists()) {
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("Write: "+f.canWrite());
            System.out.println("Read: "+f.canRead());
            System.out.println("Size: "+f.length());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }
}
