package javapractice;
import java.util.*;

public class days2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a day from monday to sunday:");
		String day=input.nextLine();
		switch(day)
		{
		case "sunday":
		case "saturday":
			System.out.println("yayy it's a weekend");
			break;
		case "Monday":
		case "Tuesday":
		case "wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("uff it's a weekday");
			break;
		default:
			System.out.println("invalid input");
		}
		
input.close();
	}

}