import java.util.*;
public class greeting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Give the rating!");
        int a =sc.nextInt();
        switch(a) {
            case 1:System.out.println("You gave the rating of one star *");
            break;
            case 2:System.out.println("You gave the rating of two star **");
            break;
            case 3:System.out.println("You gave the rating of three star ***");
            break;
            case 4:System.out.println("You gave the rating of four star ****");
            break;
            case 5:System.out.println("You gave the rating of five star *****");
            break;
            default:System.out.println("Invalid Entry");
        }
        sc.close();
    }
    
}
