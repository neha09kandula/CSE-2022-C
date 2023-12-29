package cse225i3;
import java.io.File;
import java.io.IOException;

public class Filehandling {
	public static void main(String[] args)
	{
		try
		{
			File f=new File("my_file");
			if(f.createNewFile())
			{
				System.out.println("file created:"+f.getName());
			}
			else
			{
				System.out.println("already exsists");
			}
		}
		catch(IOException e)
		{
			System.out.println("error has occured");
		}
	}

}
