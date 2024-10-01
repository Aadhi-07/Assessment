import java.io.File;
import java.util.Scanner;
public class fread{
    public static void main(String[] args) {
        try {
            File obj = new File("File.txt");
            Scanner r=new Scanner(obj);
            while (r.hasNextLine()){
                String data = r.nextLine();
                System.out.println(data);
            }r.close();

        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("error occured");
        }
    }
}
