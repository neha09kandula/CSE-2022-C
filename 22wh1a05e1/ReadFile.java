package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile 
{
	public static void main(String[] args)
	{
		try
		{
			File obj = new File("my file.txt");
			Scanner Reader = new Scanner(obj);
			while (Reader.hasNextLine())
			{
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Content does not exist");
		}
	}
}