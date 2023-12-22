package labinternalcseC;
import java.util.*;
public class weekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		if(num == 1) {
			System.out.println("Sunday");
		}
		else if(num == 2) {
			System.out.println("Monday");
		}
		else if(num ==3) {
			System.out.println("Tuesday");
		}
		else if(num == 4) {
			System.out.println("Wednesay");
		}
		else if(num == 5) {
			System.out.println("Thursday");
		}
		else if(num == 6) {
			System.out.println("Friday");
		}
		else if(num == 7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Enter the number in the ranger 1 to 7. Try again!");
		}
		input.close();	
				}
}
