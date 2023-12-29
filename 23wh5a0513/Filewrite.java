package cse13;
import java.io.IOException;
import java.io.Writer;
public class Filewrite {
	public static void main(String[] args) {
		try (Writer writer2 = new Write()){
			writer2.write("java files are good");
			Writer writer = new Write();
			writer.close();
			System.out.println("successfully writtern");
		}
	catch(IOException e) {
		System.out.println("an error has occured");
	}
	}

}