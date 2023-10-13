import java.util.*;
public class factorial{
 public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      System.out.println("enter a number");
      int x=input.nextInt();
	int fact=1;
	for(int i=x;i>=1;i--){
		fact=fact*i;
	}
	System.out.println("factorial is:"+fact);
  
}

}