import java.util.*;
public class rectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght and bredth of the rectangle:");
        int length=sc.nextInt();
        int bredth=sc.nextInt();
        if(length==bredth)
        {
            System.out.print("The given Rectangle is Square");
        }
        else
        {
            System.out.println("Given Rectangle is not a Square");
        }
    }
}