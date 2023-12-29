package gui;
import java.io.File;
import java.io.IOException;

public class create_file {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {

			File Obj = new File("myfile.txt");
			if (Obj.createNewFile()) {
			System.out.println("File created: " + Obj.getName());
			}
			else {
			System.out.println("File is already created.");
			}
			}
			catch (IOException e) {
			System.out.println("there is an error");
			e.printStackTrace();
			}
			
	}
}
