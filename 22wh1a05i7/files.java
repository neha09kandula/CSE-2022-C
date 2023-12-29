package javaprogram;
import java.io.File;
import java.io.IOException;

public class files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File Obj=new File("my file");
			if(Obj.createNewFile()) {
				System.out.println("File created:"+Obj.getName());
			}
			else
			{
				System.out.println("File already exist");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error has occured");
			e.printStackTrace();
		}

	}

}
