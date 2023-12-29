package Java;
import java.io.FileWriter;
import java.io.IOException;
public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter obj=new FileWriter("myfile.txt"); 
			obj.write("This a java text file");
			obj.close();
			System.out.println("Written in the file");
		}
		catch(IOException e) {
			System.out.println("There seems to be an error");
			e.printStackTrace();
		}
	}
}

