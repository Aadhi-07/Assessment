import java.util.Scanner;
public class calculator {
    public static double add(double a,double b){
        return a+b;
    }
    public static double sub(double a,double b){
        return a-b;
    }public static double multiple(double a,double b){
        return a*b;
    }public static double divide(double a,double b){
        if (b==0){
            System.out.println("Error!division by zero");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        double n1=scanner.nextDouble();
        System.out.println("Enter second number:");
        double n2=scanner.nextDouble();
        System.out.println("Addition of two number is "+add(n1,n2));
        System.out.println("Subraction of two number is "+sub(n1,n2));
        System.out.println("Multiplication of two number is "+multiple(n1,n2));
        System.out.println("Division of two number is "+divide(n1,n2));
    scanner.close();
    }
    
}