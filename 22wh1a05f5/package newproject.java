package newproject;
import java.util.*;
public class Stringsop {
	public static String  rev(String str1) {
		String[] word=str1.split(" ");
		String result=" ";
		for(int i=word.length-1;i>=0;i--) {
			if(i==0) {
				result+=word[i];
			}
			else {
				result+=word[i]+" ";
			}
		}
		return  result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner sc=new Scanner(System.in);
		String str1;
		System.out.println("enter the string;\n");
		str1 =sc.nextLine(); 
		
		//String str1="Welcome to India";
		System.out.println(rev(str1));
	}

}
