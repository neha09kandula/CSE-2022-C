package cse225i3;
import java.io.File;

public class Deletefile {
	public static void main(String[] args)
	{
		File f=new File("my_file.txt");
		if(f.delete())
		{
			System.out.println("deleted file is :"+f.getName());
		}
		else
		{
			System.out.println("del is not possible");
		}
	}

}
