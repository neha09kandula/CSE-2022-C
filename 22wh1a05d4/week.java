package cse225d4;

import java.util.*;

public class week {
	public static void main(String[] arg) {
		System.out.println("enter the number");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		
		if(num==1) {
			System.out.println("Sunday");
		}
		else if(num==2) {
			System.out.println("Monday");
		}
		else if(num==3) {
			System.out.println("Tuesday");
		}
		else if(num==4) {
			System.out.println("Wednesday");
		}
		else if(num==5) {
			System.out.println("Thursday");
		}
		else if(num==6) {
			System.out.println("Friday");
		}
		else if(num==7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("please enter the number from 1 to 7");
		}
				
		
	}
	

}
