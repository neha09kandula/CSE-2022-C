package wh1a05d4;
import java.io.File;


public class deletefile {
	public static void main(String args[]) {
		File obj=new File("my file.txt");
		if(obj.delete()) {
		System.out.println("file is deleted "+obj.getName());
	}
		else {
			System.out.println("failed to delete the file");
		}
	}

}
