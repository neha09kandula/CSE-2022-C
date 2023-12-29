package gui;
import java.io.FileWriter;
import java.io.IOException;

public class write_file {
	public static void main(String[]args) {
		try {

			FileWriter Write= new FileWriter("myfile.txt");
			Write.write("fill the files");
			Write.close();
			System.out.println("Statement is  written.");
			}
			catch (IOException e) {
			System.out.println("there is an error");
			e.printStackTrace();
			}
	}

}
