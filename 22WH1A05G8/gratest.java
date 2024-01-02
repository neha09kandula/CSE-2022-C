import java.util.*;
public class gratest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a > b && a>c && a>d)
        {
            System.out.print("Gratest number="+a);
        }
        else if(b>c && b>d)
        {
            System.out.print("Gratest number="+b);
        }
        else if(c>d)
        {
            System.out.print("Gratest number="+c);
        }
        else
        {
            System.out.print("Gratest number="+d);
        }
    sc.close();
    }
}
