package labprograms;

import java.io.File;
public class Deletefile {

	public static void
	main(String[] args) {

	// TODO Auto-generated method stub

	File Obj = new
	File("myfile.txt");
	if (Obj.delete()) {

	System.out.println("The deleted file is : "

	+ Obj.getName());
	}
	else {

	System.out.println("Failed in deleting the file.");
	}
	}
}
