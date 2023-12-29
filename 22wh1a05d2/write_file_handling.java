package cse_c;

import java.io.FileWriter;
import java.io.IOException;

public class write_file_handling {
	public static void main(String []args){
	try {
		FileWriter Writer= new FileWriter("myfile.txt");
		Writer.write("Files in Java are good!!");
		Writer.close();
		System.out.println("Successfully written.");
		}
		catch (IOException e) {
			System.out.println("An error.");
			e.printStackTrace();
		}
	}
}