package cse225i8;
import java.io.IOException;
import java.io.File;
public class Create_file {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

		File Obj = new File("myfile.txt");
			if (Obj.createNewFile()) {
				System.out.println("File created: "+ Obj.getName());
			}
		else 
		{
		System.out.println("File already exists.");
		}
	}
		catch (IOException e) 
		{
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
