package cse13;
import java.io.File;
import java.io.IOException;
public class Filehandling {
	public static void main(String[] args) {
		try {
		 File obj = new File("myfile.txt");
		 if(obj.createNewFile()) {
			 System.out.println("File created");
			 }
		 else {
			 System.out.println("File already exits");
		 }
		}
		 catch(IOException e) {
			System.out.println("an error has occured"); 
		 }
		}
	}

