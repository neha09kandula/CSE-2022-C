import java.util.*;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a Square:");
        int Side=sc.nextInt();
        System.out.println("Area:"+(Side*Side)+" Perimeter:"+(4*Side));
    }
}
