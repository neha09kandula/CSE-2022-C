package javaprograms;
import java.util.*;
public class compare {

	public static void main(String[] args) {
		int x,y,z;
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		if (x > y && x>z) {
			System.out.println("The Greatest number is: "+x);
		}
		else if(y>x && y>z) {
			System.out.println("The Greatest number is: "+y);
		}
		else {
			System.out.println("The Greatest number is: "+z);
		}
	}

}
