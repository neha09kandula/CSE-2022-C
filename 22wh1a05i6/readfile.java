package wh225i6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readfile 
{
	public static void main(String args[])
	{
		try
		{
			File obj = new File("myfile.txt");
			Scanner Reader = new Scanner(obj);
			while(Reader.hasNextLine())
			{
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error has occured");
			e.printStackTrace();
		}
	}

}
