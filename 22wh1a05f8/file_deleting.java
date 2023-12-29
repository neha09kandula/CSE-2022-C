package cse225f8;

import java.io.*;
public class file_deleting {

	public static void main(String[] args) {
		File f=new File("myfile.txt");
		try
		{
			if(f.isFile())
			{
				f.delete();
				System.out.println("file is deleted");
			}
			else
			{
				System.out.println("You have already deleted the file");
			}
		}
		catch(Exception e)
		{
			System.out.println("I think you have an error;Please recheck");
		}
		
	}

}
