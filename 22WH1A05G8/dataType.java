import java.util.*;
public class dataType {
    public static void main(String[] args) {
        System.out.print("Enter the values in the form of double:");
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double area=a*b;
        System.out.print((int)area);
    }
}
