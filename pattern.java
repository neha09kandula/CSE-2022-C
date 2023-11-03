import java.util.*;
class pattern{
	public static void main(String args[]){
		System.out.println("ENTER NO OF ROWS TO GENERATE PATTERN:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("YOUR PATTERN:");
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");}
		System.out.println();
		}

		input.close();
	}
}
