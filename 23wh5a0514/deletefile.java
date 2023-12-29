package c514;

import java.io.File;

public class deletefile {
private Object myfile;

public static void main(String args[])
{

	{
		File obj = new File("myfile.txt");
		if(obj.delete()) {
			System.out.println("file deleted");
	}
	else
	{
		System.out.println("not deleted");
	}
}
}
}
