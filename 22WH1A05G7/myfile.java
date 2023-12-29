package cse225g7;
import java.io.File;
import java.io.IOException;

public class myfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File Obj = new File("myfile.txt");
			if(Obj.createNewFile()) {
				System.out.println("file created " +Obj.getName());
			}
			else {
				System.out.println("file already exists");
			}
		}
		catch(IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}

}
