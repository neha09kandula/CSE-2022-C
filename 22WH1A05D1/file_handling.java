package cse225d1;
import java.io.File;
import java.io.IOException;
public class file_handling {
	public static void main(String[] args) {
		try
		{
			File obj = new File("MyFile.txt");
			if (obj.createNewFile())
			{
				System.out.println("File Created\n"+obj.getName());
			}
			else
			{
				System.out.println("File altready exists\n");
			}
		}
		catch(IOException e)
		{
 		System.out.println("An error has occured.\n");
		}
	} 
}

