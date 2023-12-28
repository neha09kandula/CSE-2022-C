/*                                           //1.PRODUCT AND HEIGHEST VALUE
import java.util.*;
public class internal_problems{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of products: ");
        int products = sc.nextInt();
        String highestProduct = "";
        int highestValue = Integer.MIN_VALUE;
        for (int i = 1; i <= products; i++) {
            System.out.println("Name of the product: ");
            String name = sc.next();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            System.out.println("Cost of the product: ");
            int cost = sc.nextInt();
            int productValue = quantity * cost;
            if (productValue > highestValue) {
                highestValue = productValue;
                highestProduct = name;
            }
        }
        System.out.println("Heighest value product is: " + highestProduct + " and it's total is: " + highestValue);
    }
}
*/
/*                                                  //9a.NUMBER IS A PALINDROME OR NOT
import java.util.*;                             
public class internal_problems{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
        int rev=0;
		int t=0;
		int num1 = num;
		while(num%10!=0)
		{
			t = num%10;
			rev = rev*10+t;
			num = num/10;
		}
		if (num1==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
    }
                                                    //9b.EQUAL NUMBERS CHECKING
import java.util.*;
public class internal_problems{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		if((n1==n2) && (n2==n3)  &&  (n3==n4))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}    
*/
                                                //4a. VEHICLE AND METHOD DRIVE()
/*public class internal_problems{
    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle();
        obj1.drive();
        Car obj2 = new Car();
        obj2.drive();
    }
}
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car");
    }
}
*/
                                                //4b.PRINTING LARGEST OF THREE NUMBERS
/*import java.util.*;
public class internal_problems{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        System.out.println("Enter third number: ");
        int c = input.nextInt();
        if ((a>b)&&(a>c)){
            System.out.println(a+" is largest");
        }
        else if (b>c){
            System.out.println(b+" is largest");
        }
        else{
            System.out.println(c+" is largest");
        }
    }
}
*/
