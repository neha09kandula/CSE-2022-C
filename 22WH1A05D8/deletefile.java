package cse225d8;
import java.io.File;

public class deletefile {
       public static void main(String[] args) {
           File Obj = new File("myfile.txt");
           if (Obj.delete()) {
               System.out.println("deleted file is : "+ Obj.getName());
             }
         else {
            System.out.println("Failed to deleting the file.");
         }
     }
}