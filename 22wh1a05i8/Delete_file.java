package cse225i8;
import java.io.File;
public class Delete_file {
	public static void main(String[] args) {

	// TODO Auto-generated

	

	File Obj = new
	File("myfile.txt");
	if (Obj.delete()) {

	System.out.println("The deleted file is : "+ Obj.getName());
	}
	else {

	System.out.println("Failed in deleting the file.");
	}
	}
}
