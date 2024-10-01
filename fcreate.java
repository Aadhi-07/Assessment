import java.io.File;
public class fcreate {
    public static void main(String[] args) {
        try {
            File obj = new File("File.txt");
            obj.createNewFile();
        //    for (int i=0;i<11;i++){
        //     System.out.println(i);
        //    }
        }
        catch (Exception e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}