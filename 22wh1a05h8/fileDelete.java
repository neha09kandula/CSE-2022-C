package cse225h8;
import java.io.*;
public class fileDelete {
	public static void main(String [] args) {
		File Dfile = new File("output.txt");
		Dfile.delete();
		System.out.println(Dfile.getName()+ " is deleted.");
	}
}
