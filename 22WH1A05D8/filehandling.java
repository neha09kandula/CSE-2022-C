package cse225d8;

import java.io.File;
import java.io.IOException;
public class filehandling {
        public static void main(String[]args) {
        	 try {
        		 File obj =new File("my file.txt");
        		 if(obj.createNewFile()) {
        			 System.out.println("File Create: "+obj.getName());
        		 }
        		 else {
        			 System.out.println("File already exists");
        		 }
        	 }
        	 catch (IOException e) {
        		 System.out.println("any error has been occurred");
        }
}
}
