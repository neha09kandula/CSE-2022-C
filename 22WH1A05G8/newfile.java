package programs;
import java.util.*;
import java.io.*;

public class newfile {
	public static void main(String[] args) {
		File obj = new File("my file");
		Scanner sc=new Scanner(System.in);
		while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
            
		}
	}
}