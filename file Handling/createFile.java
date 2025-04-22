import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\ujjwa\\Desktop\\lc.txt");
        if(f.createNewFile()){
            System.out.println("File create successfully");
        }
        else{
            System.out.println("File already exist");
        }
    }
}
