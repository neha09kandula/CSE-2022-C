package programs;
import java.io.FileWriter;
import java.io.IOException;
public class filewrite {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("File 1.txt");
		fw.write("This is a file created by file handling ");
		fw.write("\nThis is a file created in java lab ");
		System.out.println("Successfully written in file");
		fw.close();
	}

}
