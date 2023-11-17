package javapractice;
import java.util.*;

public class days {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("which day it is?");
		String day=input.nextLine();
		if (day.equals("saturday")||day.equals("sunday")) {
			System.out.println("yayy it's a weekend");
		}
		else
		{
			System.out.println("uff it's a weekday");
		}
			input.close();
		}
}