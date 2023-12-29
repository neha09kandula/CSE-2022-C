package FileHandling;

import java.io.File;
import java.io.IOException;

public class Createfile
{
	public static void main(String[] args) 
	{
		try
		{
			File obj = new File("my file.txt");
			if(obj.createNewFile())
			{
				System.out.println("my file got created");
			}
		}
		catch(IOException e)
		{
			System.out.println("An Error has occured");
		}
	}
}