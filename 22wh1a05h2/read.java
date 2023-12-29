package gui;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class read {
public static void main(String[] args) {
	
		try {
		File Obj1 = new File("myfile.txt");
		Scanner Reader = new Scanner(Obj1);
		while (Reader.hasNextLine()) {
		String data = Reader.nextLine();
		System.out.println(data);
		}
		Reader.close();
		}
		catch (FileNotFoundException e) {
		System.out.println("there is an error");
		e.printStackTrace();
		}
		
	}

}
