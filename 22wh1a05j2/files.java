package internal;
//file creation basic programm
import java.io.*;
public class files {
	public static void main(String args[]) {
		try {
			File myfile=new File("myfile.txt");
			if(myfile.createNewFile()) {
				System.out.println("file is created:"+myfile.getName());
			}
			else {
				System.out.println("file already exist");
			}
		}
		catch(IOException e) {
			System.out.println("an error occurs file is not created");
			
		}
	}

}
