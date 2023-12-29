package cse225f8;

import java.io.*;
import java.io.FileWriter;
public class File_write {

	public static void main(String []args)
	{
		try {
			File f=new File("myfile.txt");
			if(f.isFile())
			{
			FileWriter w= new FileWriter("myfile.txt");
			w.write("You can now write in this file");
			w.close();
			System.out.print("content in the file is written");
			}
			else
				System.out.println("no file exists");
		}
			catch (Exception e)
		{
 			System.out.println("some error as occured");
		}
	}
}
