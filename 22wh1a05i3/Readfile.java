package cse225i3;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Readfile {
	public static void main(String[] args)
	{
		try {
			
		File f=new File("my_file.txt");
		Scanner read=new Scanner(f);
		while(read.hasNextLine())
		{
			String data=read.nextLine();
			System.out.println(data);
			
		}
		read.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("exception has occured");
		}
		
	}

}
