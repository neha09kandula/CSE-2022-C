import java.util.*;
class divisibility{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	System.out.println(div(a));
}
public static String div(int x){
	if(x%5==0){
	return("number is divisible by 5");
	}
	else{
	return("not divisible by 5");
	}
}
}