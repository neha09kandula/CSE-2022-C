package cse225i0;
import java.io.File;
public class delete_file {
public static void main(String[] args) {
File Obj = new File("myfile.txt");
if (Obj.delete()) {
	System.out.println("The deleted file is : "+ Obj.getName());
	}
else {
	System.out.println("Failed in deleting the file.");
	}
}
}