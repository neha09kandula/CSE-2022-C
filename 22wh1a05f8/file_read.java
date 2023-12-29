package cse225f8;

import java.util.*;
import java.io.*;

public class file_read {

	public static void main(String[] args)
	{
		try {
			File Obj = new File("myfile.txt");
			Scanner r = new Scanner(Obj);
			while (r.hasNextLine()) {
			String data = r.nextLine();
			System.out.println(data);
			}
			r.close();
			}
			catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
			}
	}

}
