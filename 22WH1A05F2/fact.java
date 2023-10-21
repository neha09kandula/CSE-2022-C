import java.util.*;
public class fact{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=1;
        int num = input.nextInt();
        for(int i=1;i<=num;i++){
            number=number*i;
        }
        System.out.println(number);
    }
}