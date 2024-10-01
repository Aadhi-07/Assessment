import java.io.FileWriter;
import java.io.IOException;

public class fwrite {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("File.txt");
            for (int i = 0; i <= 10; i++) {
                obj.write(i + "\n"); 
                System.out.println(i); 
            }
            obj.close(); 
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
