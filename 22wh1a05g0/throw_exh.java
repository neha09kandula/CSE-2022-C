package cse_225g0;
import java.util.*;
public class throw_exh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if ((number >= 0) && (number < 21)) {
		       long fact = 1;
		       for (int i = 1; i <= number; i++) {
		           fact = fact * i;
		       }
		       System.out.println(fact);
		   } else 
		   {

		       throw new IllegalArgumentException("THe argument isn't legal");
		   }
		}

	}