package cse225g7;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		try {

			FileWriter Writer = new FileWriter("myfile.txt");
			Writer.write("Hello World!!");
			Writer.close();
			System.out.println("Successfully written.");
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}

}
