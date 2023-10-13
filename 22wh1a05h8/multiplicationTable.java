package javaprograms;
import java.util.*;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int i;
		for(i = 1; i<=10; i++)
		{
			System.out.println(num + "*" + i + "=" + num*i);
		}
		input.close();
	}

}
