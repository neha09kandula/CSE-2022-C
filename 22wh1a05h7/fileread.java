package programs;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class fileread {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File obj=new File("File 1.txt");
		Scanner reader=new Scanner(obj);
		while (reader.hasNextLine())
		{
			String d=reader.nextLine();
			System.out.println(d);
		}
		reader.close(); 
	}

}
