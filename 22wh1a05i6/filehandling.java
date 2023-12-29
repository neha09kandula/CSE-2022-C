package wh225i6;

import java.io.File;
import java.io.IOException;

public class filehandling 
{
		public static void main(String args[])
		{
			try
			{
				File obj = new File("myfile.txt");
				if(obj.createNewFile())
				{
					System.out.println("File Created:" +obj.getName());
				}
				else
				{
					System.out.println("File already exists.");
				}
				
			}
			catch(IOException e)
			{
				System.out.println("An error has occurred.");
				e.printStackTrace();
			}
		}

		
	
}
