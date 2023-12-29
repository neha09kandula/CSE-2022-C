package cse225h8;
import java.io.FileWriter;
public class fileWrite {
	public static void main(String [] args) {
		String data = "Data has been written into the file using 'FileWriter' keyword.";
		try {
			FileWriter output = new FileWriter("output.txt");
			output.write(data);
			System.out.println("Data is entered into file.");
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
