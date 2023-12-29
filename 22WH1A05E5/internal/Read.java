// reading a file
package Java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Read {

	public static void main(String[] args) {
		try {
			File obj=new File("myfile.txt");
			Scanner Reader = new Scanner(obj);
			while(Reader.hasNextLine()) {
				String data=Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}
		catch(FileNotFoundException e){
			System.out.println("There was an error :( ");
			e.printStackTrace();
		}
	}

}
