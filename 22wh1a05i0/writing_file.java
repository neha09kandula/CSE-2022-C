package cse225i0;
import java.io.FileWriter;
import java.io.IOException;
public class writing_file {
	public static void main(String[] args) {
	try {

	FileWriter Writer = new FileWriter("myfile.txt");
	Writer.write("Files in Java are seriously good!!");
	Writer.close();
	System.out.println("Java programs are fun.");
	}
	catch (IOException e) {
	System.out.println("An error has occurred.");
	e.printStackTrace();
	}
	}

	}
