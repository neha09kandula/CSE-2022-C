package FileHandling;

import java.io.File;

public class DeleteFile 
{
	public static void main(String[] args)
	{
		File obj = new File("my file.txt");
		if(obj.delete())
		{
			System.out.println("The deleted file is : " + obj.getName());
		}
		else
		{
			System.out.println("Failed in deleting the file.");
		}
	}
}
