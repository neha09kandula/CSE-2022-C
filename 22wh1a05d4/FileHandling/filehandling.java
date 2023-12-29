package wh1a05d4;
import java.io.File;
import java.io.IOException;
public class filehandling {
	public static void main(String args[]) {
		try {
		File Obj=new File("my file.txt");
		if (Obj.createNewFile()) {
            System.out.println("File created: "
                               + Obj.getName());
        }
        else {
            System.out.println("File already exists.");
        }
    }
    catch (IOException e) {
        System.out.println("An error has occurred.");
        e.printStackTrace();
    }
		
	}
	
	
	
	
	
	
	
	

}
