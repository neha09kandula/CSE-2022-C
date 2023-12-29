package cse225i5;
import java.io.File;
public class Delete {
public static void main(String[] args) {
		File obj = new File("myfile.txt");
		if(obj.delete()) {
			System.out.println("File has been deleted");
		}
		else {
			System.out.println("There seems to be an error.");
		}
	}
}
