package programs;
import java.io.File;
public class filedeletion {
	public static void main(String []args)
	{
		File o=new File("File 1.txt");
		o.delete();
		System.out.println(o.getName()+" is deleted");
	}
}
