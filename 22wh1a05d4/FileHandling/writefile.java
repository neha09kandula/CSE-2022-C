package wh1a05d4;
import java.io.FileWriter;
import java.io.IOException;




public class writefile {

	public static void main(String[] args) {
		try {
            FileWriter obj
                = new FileWriter("myfile.txt");
            obj.write(
                "Files in Java are seriously good!!");
            obj.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

	}

}
