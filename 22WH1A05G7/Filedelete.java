package cse225g7;

import java.io.File;

	public class Filedelete {

		public static void main(String[] args) {

			File Obj = new
			File("myfile.txt");
			if (Obj.delete()) {

				System.out.println("The deleted file is : "+ Obj.getName());
			}
			else {
				System.out.println("Failed in deleting.");
			}
		}
}