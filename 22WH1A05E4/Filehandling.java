package cse225e4;
import java.io.File;
import java.io.IOException;
public class Filehandling {
	public static void main(String [] args) {
		try {
			File obj=new File("myfile.txt");
			if(obj.createNewFile()) {
				System.out.println("A file is created "+obj.getName());
			}
			else {
				System.out.println("File already exists??");
			}
		}
		catch(IOException e ){
			System.out.println("An error has occured");
			e.printStackTrace();
		}
		
		
	}
}	
