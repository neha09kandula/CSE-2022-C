package csec;
import java.io.File;
import java.io.IOException;
public class filecreation {
public static void main(String[]args)
{
	try
	{
		File obj=new File("myfile.txt");
		if(obj.createNewFile())
		{
			System.out.println("file created:"+obj.getName());
		}
		else {
			System.out.println("File already exists");
		}
	}
	catch(IOException e)
	{
		System.out.println("An error has occurred");
	    e.printStackTrace();
	}
}
}
