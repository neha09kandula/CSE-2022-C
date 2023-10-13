import java.util.Scanner;
public  class Fact{
public static void main(String[] args){
	int x,y=1,i=0;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the number:");
	x=input.nextInt();
	for(i=1;i<x;i++){
	y+=y*i;
	}
	System.out.println(y);
}
}
	