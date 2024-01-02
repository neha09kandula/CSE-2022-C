import java.lang.Math;
import java.util.*;
public class numPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.print("Square of the number:"+((int) Math.pow( num,3)));
    }
}
