import java.io.*;
import java.util.*;

public class tables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int N = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = N * i; 
            System.out.printf("%d x %d = %d%n", N, i, result);
        }
        
        scanner.close(); 
    }
}
