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
package Practiceprograms;

import java.io.File;

public class deletefile {

public static void
main(String[] args) {

// TODO Auto-generated



File Obj = new
File("myfile.txt");
if (Obj.delete()) {

System.out.println("The
deleted file is : "

+ Obj.getName());
}
else {

System.out.println(
"Failed in
deleting the file.");
}
}

}
