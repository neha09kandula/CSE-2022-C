package cse_c;

import java.io.IOException;

public class Throws {
	void myMethod(int num)throws IOException,ClassNotFoundException{
		if(num==1){
		throw new IOException("IO Exception Occurred");
		//else { 
		throw new ClassNotFoundException("Class Not Found Exception");
		}
		//public class Throws {
			public static void main(String args[]){
				try{
					Throws obj=new Throws();
					obj.myMethod(1);
					}
				catch(Exception ex){
					System.out.println(ex);
					}
				private void myMethod(int i);
			}
}
}