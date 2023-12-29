package cse225h8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileRead {
	public static void main(String [] args) throws FileNotFoundException {
		File fileReader = new File("output.txt");
		Scanner reader = new Scanner(fileReader);
		while(reader.hasNextLine()) {
			String d = reader.nextLine();
			System.out.println(d);
		}
		reader.close();
	}
}
