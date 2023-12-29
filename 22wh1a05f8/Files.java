package cse225f8;
//Creating the file.
import java.io.*;
public class Files {

	public static void main(String[] args) {
		File f=new File("myfile.txt");
		try {
			if(f.createNewFile())
			{
				System.out.println("file is created successfully  "+f.getName());
			}
			else
			{
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			System.out.println("problem in creating file");
			//e.printStackTrace();
		}
	}

}
