import java.util.*;
public class oddeven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0) {
            System.out.println("A is Even number");
        }
        else{
            System.out.println("A is Odd number");
        }
        sc.close();
    }
    
}
