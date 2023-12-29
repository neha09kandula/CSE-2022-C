package cse_225g0;
import java.util.*;
public class try_exh {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the age");
		int Age=sc.nextInt();
		if(Age<18){
			throw new ArithmeticException("Dont have Vote right");
		}
		else {
			System.out.println("Can vote");
		}
	}

}
