package cse_c;

import java.io.File;

public class Delete_file_handling {
	public static void main(String[] args){
		File Obj = new
		File("myfile.txt");
		if (Obj.delete()) 
		{
			System.out.println("The deleted file is : "+ Obj.getName());
		}
	else {
		System.out.println("Error in deleting the file.");
	}
  }
}