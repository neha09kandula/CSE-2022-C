package cse225h8;
import java.io.File;
public class fileCreation {
	public static void main(String [] args) {
		File file = new File("newfile.txt");
	
	try{
		boolean value = file.createNewFile();
		if(value) {
			System.out.println("File got created.");
		}
		else {
			System.out.println("File already exists.");
		}
	}
	catch(Exception e) {
		e.getStackTrace();
	}
	}
}
