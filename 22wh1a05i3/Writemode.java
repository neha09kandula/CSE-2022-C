package cse225i3;
import java.io.FileWriter;
import java.io.IOException;

public class Writemode {
	public static void main(String[] args)
	{
		try {
			FileWriter w=new FileWriter("my_file.txt");
			w.write("i am sanjana,from cse c ");
			w.close();
			System.out.println("sucessfully written");
		}
		catch(IOException e)
		{
			System.out.println("error occured");
		}
		
	}

}
