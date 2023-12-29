package gui;
import java.io.File;

public class delete_file {
	public static void 	main(String[] args) {
	File Obj1 = new
	File("myfile.txt");
	if (Obj1.delete()) {
	System.out.println("The deleted file is : " + Obj1.getName());
		}
	else {
		System.out.println("file is not deleted");
			
	}
	}
}