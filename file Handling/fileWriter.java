import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter f=new FileWriter("C:\\Users\\ujjwa\\Desktop\\lc.txt");
            try {
                f.write("java programming is the best language");
            }
            finally {
                f.close();
            }
            System.out.println("Successfully data wrote in file");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
