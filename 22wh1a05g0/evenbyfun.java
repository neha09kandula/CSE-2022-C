import java.util.*;
class evenbyfun{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	System.out.println(div(a));
}
public static String div(int x){
	if(x%2==0){
	return("num is even");
	}
	else{
	return("num is odd");
	}
}
}