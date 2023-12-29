package Frame;

import java.io.FileWriter;
import java.io.IOException;

public class writefile 
{
	public static void main(String args[])
	{
		try
		{
			FileWriter Writer = new FileWriter("myfile.txt");
			Writer.write("Files in java are seriously good");
			Writer.close();
			System.out.println("successfully written");
		}
		catch(IOException e)
		{
			System.out.println("An error has occured");
			e.printStackTrace();
		}
	}

}