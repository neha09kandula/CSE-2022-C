import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        for(int line=1;line<=num;line++){
            for (int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}