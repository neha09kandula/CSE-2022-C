import java.util.Scanner;  
public class IntegerByteValue{  
    public static void main(String[] args) {      
        System.out.print("Enter the Desired Numeric Value: ");        
        Scanner sc = new Scanner(System.in);          
        int i = sc.nextInt();                 
        sc.close();  
        Integer myValue = new Integer(i);  
        System.out.println("The Value of Byte is: " +myValue.byteValue());  
    }  
}  