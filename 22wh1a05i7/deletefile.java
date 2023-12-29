package javaprogram;
import java.io.File;
public class deletefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File Obj=new File("myfile.txt");
		if(Obj.delete())
		{
			System.out.println("the deleted file is:"+Obj.getName());
		}
		else
		{
			System.out.println("failed in deleting the file");
		}

	}

}
