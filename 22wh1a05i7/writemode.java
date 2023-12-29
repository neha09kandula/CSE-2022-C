package javaprogram;
import java.io.FileWriter;
import java.io.IOException;

public class writemode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter Writer=new FileWriter("myfile.txt");
			Writer.write("java is coding language");
			Writer.close();
			System.out.println("iam siri chandana");
			
		}
		catch(IOException e)
		{
			System.out.println("An error has occured");
			e.printStackTrace();
		}
		

	}

}
